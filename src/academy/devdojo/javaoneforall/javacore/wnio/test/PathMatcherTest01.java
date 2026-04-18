package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    static void main(String[] args) {
        Path path01 = Paths.get("folder/subfolder2/file.png");
        Path path02 = Paths.get("folder/subfolder2/file.java");
        Path path03 = Paths.get("folder/subfolder2/file.txt");
        matches(path01,"glob:*.png");
        matches(path01,"glob:**.png");
        matches(path01,"glob:**/*.{png,java,txt}");
        matches(path02,"glob:**/*.{png,java,txt}");
        matches(path03,"glob:**/*.{png,java,txt}");
        matches(path01,"glob:**/*.???");
        matches(path02,"glob:**/*.???");
        matches(path03,"glob:**/*.???");
        matches(path03,"glob:**/file.???");
    }
    private static void matches (Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
