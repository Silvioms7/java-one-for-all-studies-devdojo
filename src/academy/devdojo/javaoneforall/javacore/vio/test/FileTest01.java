package academy.devdojo.javaoneforall.javacore.vio.test;

import java.io.File;
import java.io.IOException;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Is created: " + isCreated);

            boolean exists = file.exists();
            System.out.println("Exists: " + exists);

            String path = file.getPath();
            System.out.println("Path: " + path);

            String absolutePath = file.getAbsolutePath();
            System.out.println("Absolute path: " + absolutePath);

            System.out.println("Is file? " + file.isFile());

            System.out.println("Is dir? " + file.isDirectory());

            System.out.println("Is hidden? " + file.isHidden());

            System.out.println("Last modified: " + new Date(file.lastModified()).toInstant().atZone(ZoneId.systemDefault()));

            if (exists) {
                boolean isDelete = file.delete();
                System.out.println("Is delete: " + isDelete);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
