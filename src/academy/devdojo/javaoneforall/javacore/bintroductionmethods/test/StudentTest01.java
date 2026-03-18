package academy.devdojo.javaoneforall.javacore.bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain.Student;
import academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter printer = new StudentPrinter();
        student01.name = "Barreal";
        student01.age = 18;
        student01.gender = 'M';

        student02.name = "GabiGol";
        student02.age = 19;
        student02.gender = 'M';

        printer.print(student01);
        printer.print(student02);
    }
}
