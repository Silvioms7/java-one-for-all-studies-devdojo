package academy.devdojo.javaoneforall.javacore.ycollection.test;

import academy.devdojo.javaoneforall.javacore.ycollection.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L, "Naruto", 15, 5));
        mangas.add(new Manga(5L, "Pokemon", 25, 2));
        mangas.add(new Manga(2L, "Boruto", 12,34));
        mangas.add(new Manga(1L, "Jujutsu Kaisen", 24.90, 0));
        mangas.add(new Manga(3L, "Dragon Ball Z", 22, 1));
        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) if (mangaIterator.next().getQuantidade() == 0) mangaIterator.remove();
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        for (Manga manga : mangas) System.out.println(manga);
    }
}
