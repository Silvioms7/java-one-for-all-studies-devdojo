package academy.devdojo.javaoneforall.javacore.oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
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
        }
        System.out.println("Outside custom file creator");
    }
}
