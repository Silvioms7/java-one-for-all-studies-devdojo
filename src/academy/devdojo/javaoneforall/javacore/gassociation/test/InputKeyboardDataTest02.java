package academy.devdojo.javaoneforall.javacore.gassociation.test;

import java.util.Scanner;

public class InputKeyboardDataTest02 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the most advanced AI system!");
        while (true) {
            System.out.println("Ask any question and I shall reply yes or on.");
            String question = input.nextLine();
            if (question.charAt(0) == ' ') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            System.out.println("Would you like to continue? (yes or no)");
            String cQuestion = input.nextLine();
            if (cQuestion.equals("no")) {break;}
        }
    }
}
