package academy.devdojo.javaoneforall.javacore.npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Television;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.npolymorphism.service.ProductTaxReportService;

public class ProductTest03 {
    static void main(String[] args) {
        Product product01 = new Computer("Mac Neo", 499);
        Product product02 = new Television("lG 35\"", 1500);
        Tomato tomato = new Tomato("Brazilian", 12);
        tomato.setBestConsumedBefore("30/03/2026");

        ProductTaxReportService.generateTaxReport(product01);
        System.out.println("----------------------------------");
        ProductTaxReportService.generateTaxReport(product02);
        System.out.println("----------------------------------");
        ProductTaxReportService.generateTaxReport(tomato);

    }
}
