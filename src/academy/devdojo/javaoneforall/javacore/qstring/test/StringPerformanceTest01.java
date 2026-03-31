package academy.devdojo.javaoneforall.javacore.qstring.test;

public class StringPerformanceTest01 {
    static void main(String[] args) {
        long begin = System.currentTimeMillis();
        concatString(30_000);
        long end = System.currentTimeMillis();
        System.out.println("Time taken with String " + (end-begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuilder(100_000);
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder " + (end-begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuffer(100_000);
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuffer " + (end-begin) + "ms");
    }

    private static void concatStringBuffer(int size) {
        StringBuffer text = new StringBuffer(size);
        for (int i = 0; i <size; i++) {
            text.append(i);
        }
    }

    private static void concatStringBuilder(int size) {
        StringBuilder text = new StringBuilder(size);
        for (int i = 0; i <size; i++) {
            text.append(i);
        }
    }
    private static void concatString(int size) {
        String text = "";
        for (int i = 0; i <size; i++) {
            text += i;
        }
    }
}
