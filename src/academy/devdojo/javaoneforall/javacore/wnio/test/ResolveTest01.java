package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    static void main(String[] args) {
        Path dir = Paths.get("home/silvio");
        Path file = Paths.get("dev/text.txt");
        Path resolve = dir.resolve(file);
        System.out.println(resolve);

        Path absolute = Paths.get("/home/silvio");
        Path relative = Paths.get("dev");
        Path fileRelative = Paths.get("text.txt");

        System.out.println("1: " + absolute.resolve(relative));
        System.out.println("2: " + absolute.resolve(fileRelative));
        System.out.println("3: " + relative.resolve(absolute));
        System.out.println("4: " + relative.resolve(fileRelative));
        System.out.println("5: " + fileRelative.resolve(absolute));
        System.out.println("6: " + fileRelative.resolve(relative));
    }
}
