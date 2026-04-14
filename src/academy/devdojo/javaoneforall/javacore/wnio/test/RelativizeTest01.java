package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    static void main(String[] args) {
        Path dir = Paths.get("academy/");
        Path clazz1 = Paths.get("academy/devdojo/javaoneforall/javacore/vio/test/BufferedReaderTest01.java");
        Path pathToClazz = dir.relativize(clazz1);
        System.out.println(pathToClazz);
        Path clazz2 = Paths.get("academy/devdojo/javaoneforall/javacore/uregex/test/PatternMatcherTest03.java");
        Path clazz1ToClazz2 = clazz1.relativize(clazz2);
        System.out.println("Test: " + clazz1ToClazz2);


        Path absolute1 = Paths.get("/home/william");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/william/devdojo/project/Test01.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.212121");

        System.out.println("1 " + absolute1.relativize(absolute3));
        System.out.println("2 " + absolute3.relativize(absolute1));
        System.out.println("3 " + absolute1.relativize(absolute2));
        System.out.println("4 " + relative1.relativize(relative2));
        System.out.println("5 " + absolute1.relativize(relative1));
    }
}
