package academy.devdojo.javaoneforall.javacore.ioverriding.test;

import academy.devdojo.javaoneforall.javacore.ioverriding.domain.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime("Naruto");
        System.out.println(anime.toString());
    }
}
