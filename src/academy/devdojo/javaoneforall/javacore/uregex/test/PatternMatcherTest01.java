package academy.devdojo.javaoneforall.javacore.uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    static void main(String[] args) {
        String regex = "ab";
        String text = "abasdwabdsafjaab";
        Pattern compile = Pattern.compile(regex);
        Matcher matches = compile.matcher(text);
        System.out.println("text:  " + text);
        System.out.println("index: 01234567890123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found");
        while (matches.find()) {
            System.out.print(matches.start() + " ");
        }
    }
}
