package academy.devdojo.javaoneforall.javacore.labstractclasses.domain;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonusSalary() {
        this.salary = this.salary * 1.001;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
