package academy.devdojo.javaoneforall.javacore.qstring.test;

import java.util.Scanner;

public class StringTest02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name01 = "  Silvio  ";
        String name02 = "silvio";
        String numbers = "0123456";
        System.out.println(name01.charAt(0));
        System.out.println(name01.length());
        System.out.println(name01.equals(name02));
        System.out.println(name01.equalsIgnoreCase(name02));
        System.out.println(name01.replace("i", "e"));
        System.out.println(name01.toLowerCase());
        System.out.println(name01.toUpperCase());
        System.out.println(numbers.substring(0, numbers.length()));
        System.out.println("Type your username: ");
        String name03 = scanner.next().trim();
        System.out.println(name03);
    }
}
