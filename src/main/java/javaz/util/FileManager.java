package javaz.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static List<String> parseSqlFile(String filePath) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            String[] statements = content.split(";");
            List<String> parsedStatements = new ArrayList<>();
            for (String stmt : statements) {
                String trimmed = stmt.trim();
                if (!trimmed.isEmpty()) {
                    parsedStatements.add(trimmed);
                }
            }
            return parsedStatements;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
