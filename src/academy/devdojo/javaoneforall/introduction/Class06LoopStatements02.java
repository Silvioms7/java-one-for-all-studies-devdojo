package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements02 {
    static void main(String[] args) {
        for (int i = 0; i < 1000000; i+=2) {
            System.out.println(i);
        }
        for (int i = 0; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int numbers = 0;
        while (numbers <= 1000000) {
            numbers++;
            if ((numbers % 2) == 0) {
                System.out.println(numbers);
            }
        }
    }
}
