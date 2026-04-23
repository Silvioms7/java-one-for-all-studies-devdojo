package academy.devdojo.javaoneforall.javacore.ycollection.test;

import academy.devdojo.javaoneforall.javacore.ycollection.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {


    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L, "Naruto", 15));
        mangas.add(new Manga(5L, "Pokemon", 25));
        mangas.add(new Manga(2L, "Boruto", 12));
        mangas.add(new Manga(1L, "Jujutsu Kaisen", 24.90));
        mangas.add(new Manga(3L, "Dragon Ball Z", 22));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("----------------------------------------------");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("----------------------------------------------");
//        Collections.sort(mangas,new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
