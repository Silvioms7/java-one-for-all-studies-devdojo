package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    static void main(String[] args) {
        Path zipFile = Paths.get("folder/file.zip");
        Path sourceFiles = Paths.get("folder/subfolder1/subsubfolder");
        zip(zipFile,sourceFiles);
    }

    private static void zip(Path zipFile, Path sourceFiles) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(zipFile));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceFiles)) {
            for (Path files : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(files.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(files, zipStream);
                zipStream.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
