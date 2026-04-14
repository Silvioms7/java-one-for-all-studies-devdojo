package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    static void main(String[] args) {
        Path p1 = Paths.get("E:\\JetBrains\\Projetos\\java-one-for-all-studies-devdojo\\README.md");
        Path p2 = Paths.get("E:\\JetBrains\\Projetos\\java-one-for-all-studies-devdojo","README.md");
        Path p3 = Paths.get("E:","JetBrains\\Projetos\\java-one-for-all-studies-devdojo","README.md");
        Path p4 = Paths.get("E:","JetBrains","Projetos","java-one-for-all-studies-devdojo","README.md");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
