package academy.devdojo.javaoneforall.javacore.vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        try(FileWriter fileWriter = new FileWriter(file);) {
            fileWriter.write("Hello, I`m Silvio\n:D");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
