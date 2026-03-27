package academy.devdojo.javaoneforall.javacore.npolymorphism.service;

import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Tomato;

public class ProductTaxReportService {
    public static void generateComputerTaxReport(Computer computer) {
        System.out.println("Starting the report for Computer");
        double taxValue = computer.calculateTaxValue();
        System.out.println("Computer " + computer.getName());
        System.out.println("Price " + computer.getPrice());
        System.out.println("Tax value " + taxValue);
    }

    public static void generateTomatoTaxReport(Tomato tomato) {
        System.out.println("Starting the report for Tomato");
        double taxValue = tomato.calculateTaxValue();
        System.out.println("Tomato " + tomato.getName());
        System.out.println("Price " + tomato.getPrice());
        System.out.println("Tax value " + taxValue);
    }

}
