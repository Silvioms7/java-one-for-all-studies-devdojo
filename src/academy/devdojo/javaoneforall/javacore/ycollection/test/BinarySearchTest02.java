package academy.devdojo.javaoneforall.javacore.ycollection.test;

import academy.devdojo.javaoneforall.javacore.ycollection.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L, "Naruto", 15));
        mangas.add(new Manga(5L, "Pokemon", 25));
        mangas.add(new Manga(2L, "Boruto", 12));
        mangas.add(new Manga(1L, "Jujutsu Kaisen", 24.90));
        mangas.add(new Manga(3L, "Dragon Ball Z", 22));
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(4L, "Dragon Ball Z", 22);
        System.out.println(Collections.binarySearch(mangas,mangaToSearch));
    }
}
