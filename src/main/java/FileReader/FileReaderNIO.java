package FileReader;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileReaderNIO {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File file = new File(classLoader.getResource("MyProfile.txt").getFile());

        List<String> lines = Files.readAllLines(file.toPath());
        lines.forEach(System.out::println);


        Files.writeString(Path.of(file.getPath()), "Birthday: 1986", StandardOpenOption.CREATE);
        Files.writeString(Path.of(file.getPath()), "Hometown: Ha Nma", StandardOpenOption.APPEND);
    }
}
