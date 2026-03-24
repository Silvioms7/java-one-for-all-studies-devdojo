package academy.devdojo.javaoneforall.javacore.ioverriding.domain;

public class Anime extends Object{
    private String name;

    public Anime(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name: " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
