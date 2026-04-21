package academy.devdojo.javaoneforall.javacore.ycollection.test;

import academy.devdojo.javaoneforall.javacore.ycollection.domain.Smartphone;

public class EqualsTest01 {
    static void main(String[] args) {
        Smartphone s5 = new Smartphone("S2FS34J231", "Redmi Note 12");
        Smartphone s6 = new Smartphone("S2FS34J231", "Redmi Note 12");
        System.out.println(s5.equals(s6));
    }
}