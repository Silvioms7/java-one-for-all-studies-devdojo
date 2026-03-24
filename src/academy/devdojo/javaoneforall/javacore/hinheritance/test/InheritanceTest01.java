package academy.devdojo.javaoneforall.javacore.hinheritance.test;

import academy.devdojo.javaoneforall.javacore.hinheritance.domain.Address;
import academy.devdojo.javaoneforall.javacore.hinheritance.domain.Employee;
import academy.devdojo.javaoneforall.javacore.hinheritance.domain.Manager;

public class InheritanceTest01 {
    static void main(String[] args) {
        Address address01 = new Address("22th ave", "123456");
        Address address02 = new Address("Haven", "000000");
        Employee employee = new Employee("Silvio");
        employee.setSocialSecurityNumber("777");
        employee.setSalary(9000D);
        employee.setAddress(address01);

        employee.print();

        System.out.println("-----------------");

        Manager manager = new Manager("Jesus Cristo");
        manager.setSocialSecurityNumber("001");
        manager.setSalary(9999999.9);
        manager.setAddress(address02);
        manager.setDepartment("Supreme");
        manager.print();
    }
}
