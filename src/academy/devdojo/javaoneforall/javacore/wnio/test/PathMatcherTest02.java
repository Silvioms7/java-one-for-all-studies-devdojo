package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTestJavaOrClass extends SimpleFileVisitor<Path> {
    private static final PathMatcher MATCHER = FileSystems.getDefault().getPathMatcher("glob:**/*Test*.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (MATCHER.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}


public class PathMatcherTest02 {
    static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("."), new FindAllTestJavaOrClass());
    }
}


