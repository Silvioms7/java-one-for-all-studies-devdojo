package academy.devdojo.javaoneforall.javacore.bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain.Student;

public class StudentTest02 {
    static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        student01.name = "Barreal";
        student01.age = 18;
        student01.gender = 'M';

        student02.name = "GabiGol";
        student02.age = 19;
        student02.gender = 'M';

        student01.print();
        student02.print();
    }
}
