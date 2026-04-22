package academy.devdojo.javaoneforall.javacore.ycollection.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    static void main(String[] args) {
        List names = new ArrayList(); // 1.4
        List names2 = new ArrayList();
        names.add("Silvio");
        names.add("Souza");
        names.add(543435);
        names2.add("Chubby");
        names2.add("Imm");
        names.addAll(names2);

        System.out.println(names);

        for (var nome : names) {
            System.out.println(nome);
        }
        System.out.println("------------------");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("==================");

        List<String> namess = new ArrayList();
        namess.add("Jesus");
        namess.add("Cristo");
        namess.add("2324");
        for (var nome : namess) {
            System.out.println(nome);
        }
    }
}
