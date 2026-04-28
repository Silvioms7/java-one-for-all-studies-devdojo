package academy.devdojo.javaoneforall.javacore.ycollection.test;

import academy.devdojo.javaoneforall.javacore.ycollection.domain.Manga;
import academy.devdojo.javaoneforall.javacore.ycollection.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneNameComparator implements Comparator<Smartphone> {


    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class MangaPriceComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga m1, Manga m2) {
        return Double.compare(m1.getPrice(), m2.getPrice());
    }
}

public class NavigableSetTest01 {
    static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneNameComparator());
        Smartphone smartphone = new Smartphone("4833", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(4L, "Naruto", 15, 5));
        mangas.add(new Manga(5L, "Pokemon", 25, 2));
        mangas.add(new Manga(2L, "Boruto", 12,34));
        mangas.add(new Manga(1L, "Jujutsu Kaisen", 24.90, 0));
        mangas.add(new Manga(3L, "Dragon Ball Z", 22, 1));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga yuyu = new Manga(43L, "Yuyu Hakusho", 8, 5);

        // lower <
        // floor <=
        // higher >
        // ceiling >=

        System.out.println("--------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
    }
}
