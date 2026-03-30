package academy.devdojo.javaoneforall.javacore.qstring.test;

public class StringTest01 {
    static void main(String[] args) {
        String name01 = "Jesus";
        String name02 = "Jesus";
        name01 = name01.concat(" Cristo");
        System.out.println(name01);
        System.out.println(name01.equals(name02));
        String name03 = new String("Jesus Cristo");
        System.out.println(name01 == name03);
        System.out.println(name01 == name03.intern());
        System.out.println(name01.equals(name03));
    }
}
