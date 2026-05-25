package javaz.io;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileManagerTest {

    private final String testFileName = "execution-point-test.txt";
    private final Path testFilePath = Paths.get(testFileName);

    @BeforeEach
    public void setUp() throws IOException {
        // Clean up before tests just in case
        Files.deleteIfExists(testFilePath);
    }

    @AfterEach
    public void tearDown() throws IOException {
        // Clean up after tests
        Files.deleteIfExists(testFilePath);
    }

    /**
     * Demonstrates Priority 1: Execution Point (Filesystem)
     * Creates a temporary file in the project's root directory (execution path).
     * Proves that FileManager resolves the filesystem file before attempting a classpath lookup.
     */
    @Test
    public void testFilesystemPriorityOverClasspath() throws IOException {
        String localContent = "I AM FROM THE EXECUTION POINT";
        Files.writeString(testFilePath, localContent);

        String readContent = FileManager.readFile(testFileName).trim();
        
        assertEquals(localContent, readContent, 
            "FileManager should prioritize reading from the filesystem over classpath when the file exists locally.");
    }

    /**
     * Demonstrates Priority 2: Classpath Overriding (Test vs Main)
     * Reads a file that exists in both `src/main/resources` and `src/test/resources`.
     * Proves that Maven's test classpath correctly overrides main resources.
     */
    @Test
    public void testClasspathOverrideTestOverridesMain() {
        // Using a leading "/" makes it an absolute path on the filesystem (e.g., C:\override-test.txt).
        // Since that usually doesn't exist, it falls back to the classpath, where the leading "/" 
        // indicates the root of the classpath.
        String contentWithSlash = FileManager.readFile("/override-test.txt").trim();
        assertEquals("TEST_VERSION (OVERRIDE)", contentWithSlash, 
            "Resources in src/test/resources should override those with the same name in src/main/resources.");
    }

    /**
     * Demonstrates Priority 1 catching a relative path before Priority 2.
     * There is an 'override-test.txt' file in the project's root directory.
     * Because FileManager checks the filesystem first, providing a relative path
     * resolves to this local file rather than the classpath resource.
     */
    @Test
    public void testFilesystemMasksClasspathWithRelativePath() {
        // Without a leading "/", Paths.get("override-test.txt") looks in the current execution directory.
        // It finds the file there and never attempts the classpath lookup.
        String contentWithoutSlash = FileManager.readFile("override-test.txt").trim();
        assertEquals("CONTEXT FROM EXECUTION POINT (OVERRIDE)", contentWithoutSlash,
            "When the file exists in the execution path, it is read directly, bypassing the classpath.");
    }

    /**
     * Demonstrates Visibility: Test Resources
     * Verifies that a file exclusively located in `src/test/resources` can be read successfully
     * during a test execution run.
     */
    @Test
    public void testTestResourceVisibility() {
        String content = FileManager.readFile("test-resource.txt").trim();
        assertEquals("THIS IS A TEST RESOURCE", content,
            "Test resources should be visible and readable during test execution.");
    }

    /**
     * Demonstrates Error Handling: File Not Found
     * Verifies that a descriptive RuntimeException is thrown when a file is absent
     * from both the filesystem and the classpath.
     */
    @Test
    public void testFileNotFoundThrowsException() {
        String nonexistentFile = "does-not-exist-anywhere-12345.txt";
        
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            FileManager.readFile(nonexistentFile);
        }, "Should throw an exception when the file is not found anywhere.");

        assertTrue(exception.getMessage().contains("Error reading file"),
            "Exception message should clearly indicate what file failed to read.");
    }
}
