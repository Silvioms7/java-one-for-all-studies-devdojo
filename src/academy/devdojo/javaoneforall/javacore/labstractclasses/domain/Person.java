package academy.devdojo.javaoneforall.javacore.labstractclasses.domain;

public abstract class Person extends Employee{
    public Person(String name, double salary) {
        super(name, salary);
    }

    public abstract void print();
}
