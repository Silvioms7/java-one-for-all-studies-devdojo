package academy.devdojo.javaoneforall.javacore.uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    // \d - All the digits 0-9
    // \D - Everything that is not \d
    // \s - All the blank spaces /t /r /f /n
    // \S - Everything that is not \s
    // \w - All the letters a-z, A-Z, 0-9, _
    // \W - Everything that is not \w
    static void main(String[] args) {
        String regex = "\\W";
        String text = "jh_v2f\fuyv3i bv287f\rg2!378_fb 873gf37\tb@87\n3f83yfgv6783";
        Pattern compile = Pattern.compile(regex);
        Matcher matches = compile.matcher(text);
        System.out.println("text:  " + text);
        System.out.println("index: 01234567890123456789012345678901234567890123456789012345678901234567890123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found");
        while (matches.find()) {
            System.out.println(matches.start() + " " + matches.group());
        }
    }
}
