package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements06 {
    static void main(String[] args) {
        byte day = 1;
        switch (day) {
            case 2,3,4,5,6 -> System.out.println("Business day");
            case 1,7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }
    }
}
