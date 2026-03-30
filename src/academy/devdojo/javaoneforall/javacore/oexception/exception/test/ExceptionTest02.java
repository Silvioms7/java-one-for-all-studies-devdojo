package academy.devdojo.javaoneforall.javacore.oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    static void main(String[] args) {
customFileCreator();
    }

    private static void customFileCreator() {
        File file = new File("folder/test.text");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created file: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Something happened when creating the file!");
        }
        System.out.println("Outside custom file creator");
    }
}
