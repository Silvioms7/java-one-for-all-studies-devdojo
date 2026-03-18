package academy.devdojo.javaoneforall.javacore.dconstructor.test;

import academy.devdojo.javaoneforall.javacore.dconstructor.domain.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime("Naruto","Tv",5, "On", "Sla");
        anime.print();
    }
}
