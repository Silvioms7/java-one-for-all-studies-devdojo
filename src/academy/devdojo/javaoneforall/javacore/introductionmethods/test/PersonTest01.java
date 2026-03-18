package academy.devdojo.javaoneforall.javacore.introductionmethods.test;

import academy.devdojo.javaoneforall.javacore.introductionmethods.domain.Person;

public class PersonTest01 {
    static void main(String[] args) {
        Person person = new Person();
        person.setName("Jesus Cristo");
        person.setAge(34);
//        person.print();

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
