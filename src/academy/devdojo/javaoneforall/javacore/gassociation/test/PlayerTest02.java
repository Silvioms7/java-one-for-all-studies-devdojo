package academy.devdojo.javaoneforall.javacore.gassociation.test;

import academy.devdojo.javaoneforall.javacore.gassociation.domain.Player;
import academy.devdojo.javaoneforall.javacore.gassociation.domain.Team;

public class PlayerTest02 {
    static void main(String[] args) {
        Player p01 = new Player("Neymar");
        Team team01 = new Team("Santos");
        p01.setTeam(team01);
        p01.print();
    }
}
