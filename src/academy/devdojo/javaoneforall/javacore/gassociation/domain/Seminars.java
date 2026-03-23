package academy.devdojo.javaoneforall.javacore.gassociation.domain;

public class Seminars {
    private String title;
    private Students[] students;
    private Place place;
    private Professor professor;

    public Seminars(String title) {
        this.title = title;
    }

    public Seminars(String title, Students[] students, Place place, Professor professor) {
        this.title = title;
        this.students = students;
        this.place = place;
        this.professor = professor;
    }

    public void print() {
        System.out.println("-------------------------------------------");
        System.out.println("Seminars: " + this.title);
        System.out.println("Address: " + place.getAddress());
        System.out.println("Professor`s name: " + professor.getName() + " - Research field: " + professor.getResearchField());

        System.out.println("Students`s list: ");
        for (Students s : students) {
            System.out.println("Name: " + s.getNames() + " - Age: " + s.getAges());
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
