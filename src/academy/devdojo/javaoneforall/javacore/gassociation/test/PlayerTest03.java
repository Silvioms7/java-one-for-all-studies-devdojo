package academy.devdojo.javaoneforall.javacore.gassociation.test;

import academy.devdojo.javaoneforall.javacore.gassociation.domain.Player;
import academy.devdojo.javaoneforall.javacore.gassociation.domain.Team;

public class PlayerTest03 {
    static void main(String[] args) {
        Player player01 = new Player("Brazao");
        Player player02 = new Player("Neymar");
        Team team = new Team("Santos" );
        Player[] players = {player01, player02};

        team.setPlayers(players);
        team.print();
    }
}
