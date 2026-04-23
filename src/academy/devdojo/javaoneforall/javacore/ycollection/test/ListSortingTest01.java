package academy.devdojo.javaoneforall.javacore.ycollection.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortingTest01 {
    static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Naruto");
        mangas.add("Pokemon");
        mangas.add("Boruto");
        mangas.add("Jujutsu Kaisen");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas);

        List<Double> money = new ArrayList<>();

        money.add(423.4);
        money.add(123.56);
        money.add(6544.34);
        money.add(1.1);
        money.add(0.2);
        money.add(304.56);

        Collections.sort(money);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(money);
    }
}
