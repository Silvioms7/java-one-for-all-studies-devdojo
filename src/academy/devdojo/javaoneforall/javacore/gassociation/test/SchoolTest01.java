package academy.devdojo.javaoneforall.javacore.gassociation.test;

import academy.devdojo.javaoneforall.javacore.gassociation.domain.Professor;
import academy.devdojo.javaoneforall.javacore.gassociation.domain.School;

public class SchoolTest01 {
    static void main(String[] args) {
        Professor professor = new Professor("Jesus Cristo.");
        Professor[] professors = {professor};
        School school = new School("Mundo.", professors);

        school.print();
    }
}
