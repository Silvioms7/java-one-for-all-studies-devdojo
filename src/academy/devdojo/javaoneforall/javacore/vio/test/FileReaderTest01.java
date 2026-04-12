package academy.devdojo.javaoneforall.javacore.vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    static void main(String[] args) {
        File file = new File("text.txt");
        try (FileReader fileReader = new FileReader(file);){
//            char[] in = new char[45];
//            int read = fileReader.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char)i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
