package academy.devdojo.javaoneforall.javacore.uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    // \d - All the digits 0-9
    // \D - Everything that is not \d
    // \s - All the blank spaces /t /r /f /n
    // \S - Everything that is not \s
    // \w - All the letters a-z, A-Z, 0-9, _
    // \W - Everything that is not \w
    // []
    static void main(String[] args) {
//        String regex1 = "[a-zA-Z]";
        String regex2 = "0[xX][0-9a-fA-F]";
//        String text1 = "JCisK";
        String text2 = "53 0X 43 0x 2 0XFS32 0XF412 0Xa234 0x2354E";
        Pattern compile = Pattern.compile(regex2);
        Matcher matches = compile.matcher(text2);
        System.out.println("text:  " + text2);
        System.out.println("index: 0123456789");
        System.out.println("Regex: " + regex2);
        System.out.println("Positions found");
        while (matches.find()) {
            System.out.println(matches.start() + " " + matches.group());
        }
        int hexNumber = 0xaa234;
        System.out.println(hexNumber);
    }
}
