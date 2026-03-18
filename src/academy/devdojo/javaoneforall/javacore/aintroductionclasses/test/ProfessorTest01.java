package academy.devdojo.javaoneforall.javacore.aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Jesus";
        professor.age = 34;
        professor.gender = 'M';
        System.out.printf("Name: %s %nAge: %s %nGender: %s", professor.name, professor.age, professor.gender);
    }
}
