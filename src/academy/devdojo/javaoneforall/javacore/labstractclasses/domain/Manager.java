package academy.devdojo.javaoneforall.javacore.labstractclasses.domain;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonusSalary() {
        this.salary = salary * 1.1;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
