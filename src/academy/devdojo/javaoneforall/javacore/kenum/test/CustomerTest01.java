package academy.devdojo.javaoneforall.javacore.kenum.test;

import academy.devdojo.javaoneforall.javacore.kenum.domain.Customer;
import academy.devdojo.javaoneforall.javacore.kenum.domain.CustomerType;
import academy.devdojo.javaoneforall.javacore.kenum.domain.PaymentType;

public class CustomerTest01 {
    static void main(String[] args) {
        Customer customer01 = new Customer("Julio", CustomerType.COMPANY, PaymentType.CREDIT);
        Customer customer02 = new Customer("Carlos",CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        System.out.println(customer01);
        System.out.println(customer02);
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));
        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        CustomerType[] values = CustomerType.values();
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        CustomerType customerType = CustomerType.getByReportValue("individual");
        System.out.println(customerType.getReportValue());
    }}
