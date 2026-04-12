package academy.devdojo.javaoneforall.javacore.uregex.test;

public class ScannerTest01 {
    static void main(String[] args) {
        String text = "Silvio, Renato, Alan";
        String[] names = text.split(",");
        for (String name : names) {
            System.out.println(name.trim());
        }
    }
}
