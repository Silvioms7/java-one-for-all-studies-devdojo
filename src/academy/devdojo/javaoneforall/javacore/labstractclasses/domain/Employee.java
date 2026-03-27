package academy.devdojo.javaoneforall.javacore.labstractclasses.domain;

import academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain.Person;

public abstract class Employee extends Person {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonusSalary();
    }

    public abstract void calculateBonusSalary();

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
