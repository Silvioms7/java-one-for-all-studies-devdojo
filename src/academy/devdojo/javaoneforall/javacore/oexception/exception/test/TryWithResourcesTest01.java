package academy.devdojo.javaoneforall.javacore.oexception.exception.test;

import academy.devdojo.javaoneforall.javacore.oexception.exception.domain.Reader01;
import academy.devdojo.javaoneforall.javacore.oexception.exception.domain.Reader02;

import java.io.*;

public class TryWithResourcesTest01 {
    static void main(String[] args) {
readFile01();
    }

    private static void readFile01() {
        try (Reader01 reader01 = new Reader01(); Reader02 reader02 = new Reader02()) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readFile02() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
