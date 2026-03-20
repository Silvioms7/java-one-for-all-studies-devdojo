package academy.devdojo.javaoneforall.javacore.gassociation.test;

import academy.devdojo.javaoneforall.javacore.gassociation.domain.Player;

public class PlayerTest01 {
    static void main(String[] args) {
        Player p01 = new Player("Jesus Cristo");
        Player p02 = new Player("Silvio");
        Player p03 = new Player("Simao");

        Player [] players = {p01, p02, p03};

        for (Player player : players) {
            player.print();
        }

    }
}

