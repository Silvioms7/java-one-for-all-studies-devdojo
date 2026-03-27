package academy.devdojo.javaoneforall.javacore.npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.npolymorphism.service.ProductTaxReportService;

public class ProductTest01 {
    static void main(String[] args) {
        Computer computer = new Computer("Mac Air M1", 3999.9);
        Tomato tomato = new Tomato("Italian", 1.30);
        ProductTaxReportService.generateComputerTaxReport(computer);
        System.out.println("--------------------------------");
        ProductTaxReportService.generateTomatoTaxReport(tomato);
    }
}
