package javaz.io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    /**
     * Reads a file's content as a String, using a priority-based resolution strategy.
     * <p>
     * Resolution Priority:
     * <ol>
     *   <li>Filesystem (Execution Point): First checks if the provided path exists as an absolute path
     *   or relative to the current working directory where the application is executed.</li>
     *   <li><b>[Conditional]</b> Test Resources (Classpath): If not found on the filesystem,
     *   falls back to the classpath, checks {@code src/test/resources}. <br>
     *   <i>Note: This level is only active during unit test execution ({@code mvn test}),
     *   not production ({@code mvn exec:java} or running a JAR).</i></li>
     *   <li>Main Resources (Classpath): Finally, checks {@code src/main/resources}. In production,
     *   this is the only classpath fallback available.</li>
     * </ol>
     * If you want to change a setting without recompiling the code,
     * place a file with the same name in the Execution Point (the folder where the app starts).
     * </p>
     *
     * @param filePath The file path or classpath resource name. A leading "/" for classpath
     *                 resources is handled gracefully.
     * @return The entire content of the file as a UTF-8 String.
     * @throws RuntimeException if the file cannot be found on either the filesystem or the classpath.
     */
    public static String readFile(String filePath) {
        try {
            Path path = Paths.get(filePath); // Absolute path on the filesystem is handled by Paths.get()
            // Priority 1: Filesystem (Execution Point)
            // Handles both absolute paths and relative-to-execution paths.
            if (Files.exists(path)) {
                return Files.readString(path, StandardCharsets.UTF_8);
            }
            // Priority 2 & 3: Test Resources, then Main Resources (Classpath Fallback)
            // Handled intrinsically by the JVM ClassLoader, which checks the test classpath before main.
            // A leading "/" ensures Class.getResourceAsStream searches from the classpath root (Industry standard for resources).
            String resourcePath = filePath.startsWith("/") ? filePath : "/" + filePath;
            try (InputStream is = FileManager.class.getResourceAsStream(resourcePath)) {
                if (is == null) {
                    throw new IOException("File not found on filesystem or classpath: " + filePath);
                }
                return new String(is.readAllBytes(), StandardCharsets.UTF_8);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading file: " + filePath, e);
        }
    }

    /**
     * Parses a SQL file into a list of individual SQL statements.
     *
     * @param filePath The path to the SQL file.
     * @return A list of SQL statements.
     */
    public static List<String> parseSqlFile(String filePath) {
        String content = readFile(filePath);
        String[] statements = content.split(";");
        List<String> parsedStatements = new ArrayList<>();
        for (String stmt : statements) {
            String trimmed = stmt.trim();
            if (!trimmed.isEmpty()) {
                parsedStatements.add(trimmed);
            }
        }
        return parsedStatements;
    }
}

