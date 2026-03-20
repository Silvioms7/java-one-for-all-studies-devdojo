package academy.devdojo.javaoneforall.javacore.fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;
    static{
        episodes = new int[900];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }
    public Anime(String name) {
        this.name = name;
        System.out.println(name);
    }

    public Anime() {
        for (int episode : Anime.episodes) {
            System.out.print(episode + "; ");
        }
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return Anime.episodes;
    }
}
