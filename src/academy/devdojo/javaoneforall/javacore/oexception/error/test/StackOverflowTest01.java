package academy.devdojo.javaoneforall.javacore.oexception.error.test;

public class StackOverflowTest01 {
    static void main(String[] args) {
recursion();
    }

    public static void recursion() {
        recursion();
    }
}
