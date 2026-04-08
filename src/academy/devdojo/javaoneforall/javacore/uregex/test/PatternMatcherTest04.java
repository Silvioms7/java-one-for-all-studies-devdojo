package academy.devdojo.javaoneforall.javacore.uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    // \d - All the digits 0-9
    // \D - Everything that is not \d
    // \s - All the blank spaces /t /r /f /n
    // \S - Everything that is not \s
    // \w - All the letters a-z, A-Z, 0-9, _
    // \W - Everything that is not \w
    // []
    // ? - zero or one
    // * - zero or more
    // + - one or more
    // {n,m} - from n to m
    // ()
    // | person(a|s) persons or persona
    // $
    static void main(String[] args) {
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "53 0X 43 0x 2 0XFS32 0XF412 0Xa234 0x2354E 0x1";
        Pattern compile = Pattern.compile(regex);
        Matcher matches = compile.matcher(text);
        System.out.println("text:  " + text);
        System.out.println("index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found");
        while (matches.find()) {
            System.out.println(matches.start() + " " + matches.group());
        }
        int hexNumber = 0xaa234;
        System.out.println(hexNumber);
    }
}
