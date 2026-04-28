package academy.devdojo.javaoneforall.javacore.ycollection.test;

import academy.devdojo.javaoneforall.javacore.ycollection.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(4L, "Naruto", 15));
        mangas.add(new Manga(5L, "Pokemon", 25));
        mangas.add(new Manga(2L, "Boruto", 12));
        mangas.add(new Manga(1L, "Jujutsu Kaisen", 24.90));
        mangas.add(new Manga(3L, "Dragon Ball Z", 22));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
