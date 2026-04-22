package academy.devdojo.javaoneforall.javacore.ycollection.test;

import academy.devdojo.javaoneforall.javacore.ycollection.domain.Smartphone;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    static void main(String[] args) {
        Smartphone s1 = new Smartphone("S2FS34J231", "POCO X7 PRO");
        Smartphone s2 = new Smartphone("H245SF435D", "Redmi Note 12");
        Smartphone s3 = new Smartphone("K23FDG321G", "Iphone XR");
        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("S2FS34J231", "POCO X7 PRO");

        System.out.println(smartphones.contains(s4));
        int indexSmartphones4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartphones4));
    }
}
