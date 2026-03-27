package academy.devdojo.javaoneforall.javacore.labstractclasses.test;

import academy.devdojo.javaoneforall.javacore.labstractclasses.domain.Developer;
import academy.devdojo.javaoneforall.javacore.labstractclasses.domain.Employee;
import academy.devdojo.javaoneforall.javacore.labstractclasses.domain.Manager;

public class EmployeeTest01 {
    static void main(String[] args) {
        Manager manager = new Manager("Jesus Cristo", 153468);
        Developer developer = new Developer("Silvio", 12390);
        System.out.println(manager);
        System.out.println(developer);
        manager.print();
        developer.print();
    }
}
