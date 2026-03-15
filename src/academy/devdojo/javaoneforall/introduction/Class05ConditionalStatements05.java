package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements05 {
    static void main(String[] args) {
        byte day = 5;
        switch (day) {
            case 1 -> System.out.println("Su");
            case 2 -> System.out.println("Mo");
            case 3 -> System.out.println("Tu");
            case 4 -> System.out.println("We");
            case 5 -> System.out.println("Th");
            case 6 -> System.out.println("Fr");
            case 7 -> System.out.println("Sa");
            default -> System.out.println("Invalid day");
        }
    }
}
