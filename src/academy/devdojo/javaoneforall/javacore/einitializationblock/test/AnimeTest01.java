package academy.devdojo.javaoneforall.javacore.einitializationblock.test;

import academy.devdojo.javaoneforall.javacore.einitializationblock.domain.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + "; ");
        }

    }
}
