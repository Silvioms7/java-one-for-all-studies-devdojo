package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    static void main(String[] args) {
        String dir = "/home/silvio/dev";
        String fileTxt = "../../file.txt";
        Path path1 = Paths.get(dir, fileTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
    }
}
