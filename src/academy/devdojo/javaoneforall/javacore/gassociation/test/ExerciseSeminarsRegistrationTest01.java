package academy.devdojo.javaoneforall.javacore.gassociation.test;

import academy.devdojo.javaoneforall.javacore.gassociation.domain.Place;
import academy.devdojo.javaoneforall.javacore.gassociation.domain.Professor;
import academy.devdojo.javaoneforall.javacore.gassociation.domain.Seminars;
import academy.devdojo.javaoneforall.javacore.gassociation.domain.Students;

public class ExerciseSeminarsRegistrationTest01 {
    static void main(String[] args) {
        Place place1 = new Place("Brasil");
        Place place2 = new Place("EUA");
        Professor professor1 = new Professor("Denis", "Matematica");
        Professor professor2 = new Professor("Diego", "Portugues");
        Students students1 = new Students("Silvio", 18);
        Students students2 = new Students("John", 19);
        Students students3 = new Students("Barreal", 19);
        Students[] seminarStudents1 = {students1, students2};
        Students[] seminarStudents2 = {students3};
        Seminars seminars1 = new Seminars("Matematica", seminarStudents1, place1, professor1);
        Seminars seminars2 = new Seminars("Portugues", seminarStudents2, place2,professor2);

        seminars1.print();
        seminars2.print();
    }
}
