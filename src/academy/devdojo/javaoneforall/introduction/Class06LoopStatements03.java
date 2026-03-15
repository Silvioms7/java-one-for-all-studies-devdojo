package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements03 {
    static void main(String[] args) {
        byte number = 50;
        for (int i = 0; i < number; i++) {
            System.out.println(i);
            if (i == 25) {
                break;
            }
        }
    }
}
