package academy.devdojo.javaoneforall.javacore.vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    static void main(String[] args) throws IOException {
        File folder = new File("folder");
        boolean isFolderCreated = folder.mkdir();
        System.out.println("isFolderCreated " + isFolderCreated);

        File file = new File(folder,"file.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("isFileCreated " + isFileCreated);

        File fileRenamed = new File(folder, "file_renamed.txt");
        boolean isFileRenamed = file.renameTo(fileRenamed);
        System.out.println("isFileRenamed "+isFileRenamed);

        File folderRenamed = new File("folder2");
        boolean isFolderRenamed = folder.renameTo(folderRenamed);
        System.out.println("isFolderRenamed "+isFolderRenamed);
    }
}
