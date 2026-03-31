package academy.devdojo.javaoneforall.javacore.qstring.test;

public class StringBuilderTest01 {
    static void main(String[] args) {
        String name = "Silvio";
        name.concat(" M");
        System.out.println(name);
        name = name.concat(" M");
        System.out.println(name);
        name.substring(0, 5);
        System.out.println(name);
        StringBuilder sb01 = new StringBuilder("Silvio");
        sb01.append(" M");
        System.out.println(sb01);
        sb01.reverse();
        System.out.println(sb01);
        StringBuilder sb02 = new StringBuilder("Silvio");
        sb02.delete(0, 5);
        System.out.println(sb02);
        sb02.delete(0, sb02.length());
        System.out.println(sb02);

    }
}
