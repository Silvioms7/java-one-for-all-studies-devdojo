package academy.devdojo.javaoneforall.javacore.gassociation.test;

import java.util.Scanner;

public class InputKeyboardDataTest01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Type your name!");
        String name = input.nextLine();
        System.out.println("-----------------------------");
        System.out.println("Type your age!");
        String age = input.next();
        System.out.println("-----------------------------");
        System.out.println("Type your gender!");
        String gender = input.next();
        System.out.println("-----------------------------");
        System.out.println("Registration successful");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);

    }
}
