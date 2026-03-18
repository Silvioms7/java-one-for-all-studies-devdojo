package academy.devdojo.javaoneforall.javacore.cmethodoverloading.test;

import academy.devdojo.javaoneforall.javacore.cmethodoverloading.domain.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto","Tv",5, "On");
        anime.print();
    }
}
