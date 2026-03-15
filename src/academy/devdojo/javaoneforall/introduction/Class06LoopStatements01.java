package academy.devdojo.javaoneforall.introduction;

    public class Class06LoopStatements01 {
    static void main(String[] args) {
        // while, do-while, for
            double counter = 11;
        while (counter < 10) {
            System.out.println(++counter);
        }
        do {
            System.out.println(++counter);
        } while (counter < 10);
        for (int i = 0; i < counter; i++) {
            System.out.println(i);
        }
    }
}
