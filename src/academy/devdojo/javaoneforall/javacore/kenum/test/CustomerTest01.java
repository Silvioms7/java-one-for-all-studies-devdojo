package academy.devdojo.javaoneforall.javacore.kenum.test;

import academy.devdojo.javaoneforall.javacore.kenum.domain.Customer;
import academy.devdojo.javaoneforall.javacore.kenum.domain.CustomerType;

public class CustomerTest01 {
    static void main(String[] args) {
        Customer customer01 = new Customer("Julio", CustomerType.COMPANY);
        Customer customer02 = new Customer("Julio",CustomerType.COMPANY);
        Customer customer03 = new Customer("Julio",CustomerType.INDIVIDUAL);
        Customer customer04 = new Customer("Julio",CustomerType.INDIVIDUAL);
        Customer customer05 = new Customer("Julio",CustomerType.START_UP);
        System.out.println(customer01);
        System.out.println(customer02);
        System.out.println(customer03);
        System.out.println(customer04);
        System.out.println(customer05);
    }
}
