package com.ydjs.app;

import javaz.io.FileManager;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("=== FileManager Resolution Priority Demonstration ===");
        
        // 1. Level 1: Execution Point (Filesystem)
        // This looks for a file in the same directory where you run 'mvn'
        displayFile("Level 1: Execution Point (1)", "local-config.txt");
//        displayFile("Level 1: Execution Point (2)", "/local-config.txt");

        // 2. Level 2: Main Resources (src/main/resources)
        // This is packaged with the application.
        displayFile("Level 2: Main Resources (1)", "main-resource.txt");
        displayFile("Level 2: Main Resources (2)", "/main-resource.txt");

//        // 3. Level 3: Test Resources (src/test/resources)
//        // NOTE: During 'mvn exec:java', this will usually FAIL because
//        // test resources are not on the production classpath.
//        displayFile("Level 3: Test Resources (1)", "test-resource.txt");
//        displayFile("Level 3: Test Resources (2)", "/test-resource.txt");

        // 4. Overriding Demonstration
        // Shows how FS > Test > Main
        displayFile("Override Demo 1", "override-test.txt");
        displayFile("Override Demo 2", "./override-test.txt");
        displayFile("Override Demo 3", "/override-test.txt");
        displayFile("Override Demo 4", "C:\\Users\\manua\\source\\repo\\_references\\_yd02-coding-javalin\\src\\test\\resources\\override-test.txt");
        
        System.out.println("====================================================");
    }

    private static void displayFile(String label, String path) throws Exception {
        String content = FileManager.readFile(path).trim();
        System.out.printf("[%s] Path: %-20s | Content: %s%n", label, path, content);
    }
}
