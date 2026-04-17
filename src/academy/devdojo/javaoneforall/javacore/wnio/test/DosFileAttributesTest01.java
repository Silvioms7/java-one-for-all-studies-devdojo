package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    static void main(String[] args) throws IOException {
        Path path = Paths.get("folder/new_file.txt");
        if (Files.notExists(path)) Files.createFile(path);

        Files.setAttribute(path, "dos:readonly", false);
        Files.setAttribute(path, "dos:hidden", false);

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println("dosFileAttributes " + dosFileAttributes.isReadOnly());
        System.out.println("dosFileAttributes " + dosFileAttributes.isHidden());
        System.out.println("---------------------------------");
        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);
        System.out.println("fileAttributeView " + fileAttributeView.readAttributes().isReadOnly());
        System.out.println("fileAttributeView " + fileAttributeView.readAttributes().isHidden());
    }
}
