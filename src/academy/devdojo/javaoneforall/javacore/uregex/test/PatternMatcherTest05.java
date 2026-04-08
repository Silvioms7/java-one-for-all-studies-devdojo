package academy.devdojo.javaoneforall.javacore.uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
    // . 1.3 123, 133, 1A3, 1@3
    static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)";
        String text = "JesusCristo01@unicosalvador.com, silvioms@dicipulodejesus.com, saitma!@onepunchman.com, narutoesasuke@viladafolha.com";
        String[] emails = text.split(",");
        System.out.println(Arrays.toString(emails));
        System.out.println(emails[2].trim().matches(regex));
        Pattern compile = Pattern.compile(regex);
        Matcher matches = compile.matcher(text);
        System.out.println("text:  " + text);
        System.out.println("index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found");
        while (matches.find()) {
            System.out.println(matches.start() + " " + matches.group());
        }
    }
}
