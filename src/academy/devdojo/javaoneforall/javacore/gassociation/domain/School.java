package academy.devdojo.javaoneforall.javacore.gassociation.domain;

public class School {
    private String name;
    private Professor[] professors;

    public School(String name) {
        this.name = name;
    }

    public School(String name, Professor[] professors) {
        this.name = name;
        this.professors = professors;
    }

    public void print() {
        System.out.println("School: " + this.name);
        if (professors == null) {
            return;
        }
        for (Professor professor : professors) {
            System.out.println("Professors: " + professor.getName());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessor() {
        return professors;
    }

    public void setProfessor(Professor[] professor) {
        this.professors = professors;
    }
}
