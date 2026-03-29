package academy.devdojo.javaoneforall.javacore.oexception.runtime.test;

public class RuntimeExceptionTest02 {
    static void main(String[] args) {
            division(2, 0);
    }

    private static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("The second parameter can't be zero");
        }
        return a/b;
    }
}
