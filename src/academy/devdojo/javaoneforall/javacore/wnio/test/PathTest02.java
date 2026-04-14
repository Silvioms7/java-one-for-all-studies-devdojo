package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("folder");
        if (Files.notExists(folderPath)) {
            folderPath = Files.createDirectories(folderPath);
        }
        Path subfolderPath = Paths.get("folder/subfolder/subsubfolder");
        subfolderPath = Files.createDirectories(subfolderPath);

        Path filePath = Paths.get(subfolderPath.toString(),"hi.txt");
        if (Files.notExists(filePath)) {
            filePath = Files.createFile(filePath);
        }

        Path source = filePath;
        Path taget = Paths.get(source.getParent().toString(), "hi_renamed.txt");
        Files.copy(source, taget, StandardCopyOption.REPLACE_EXISTING);

    }
}
