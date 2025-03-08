package inout12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {
    public static void main(String[] args) {
        Path p = null;
        var message = """
                        test
                        message
                    """;
        try {
            p = Path.of("test.txt");
            Files.writeString(p, message);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
