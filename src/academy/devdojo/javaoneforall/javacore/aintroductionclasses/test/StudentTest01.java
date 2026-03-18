package academy.devdojo.javaoneforall.javacore.aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.aintroductionclasses.domain.Student;

public class StudentTest01 {
    static void main(String[] args) {
        Student student = new Student();
        student.name = "Jesus";
        student.age = 34;
        student.gender = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
