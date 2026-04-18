package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)  {
        if (file.getFileName().toString().endsWith(".java"))    {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    static void main(String[] args) throws IOException {
        Path root = Paths.get("E:\\JetBrains\\Projetos\\java-one-for-all-studies-devdojo");
        Files.walkFileTree(root, new ListJavaFiles());
    }
}
