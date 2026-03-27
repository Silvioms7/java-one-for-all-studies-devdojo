package academy.devdojo.javaoneforall.javacore.npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Television;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.npolymorphism.service.ProductTaxReportService;

public class ProductTest02 {
    static void main(String[] args) {
        Product product01 = new Computer("Mac Neo", 499);
        Product product02 = new Tomato("Brazilian", 12);
        Product product03 = new Television("lG 35\"", 1500);

        ProductTaxReportService.generateTaxReport(product01);
        System.out.println("-------------------------------");
        ProductTaxReportService.generateTaxReport(product02);
        System.out.println("--------------------------------");
        ProductTaxReportService.generateTaxReport(product03);
    }
}
