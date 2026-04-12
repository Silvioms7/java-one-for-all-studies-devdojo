package academy.devdojo.javaoneforall.javacore.vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest02 {
    static void main(String[] args) throws IOException {
        File file = new File("texttest01.txt");
        while (true) {
            try(FileWriter fileWriter = new FileWriter(file, true);) {
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
                fileWriter.write(".\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
