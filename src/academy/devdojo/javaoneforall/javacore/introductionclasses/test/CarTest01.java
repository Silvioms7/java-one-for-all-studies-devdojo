package academy.devdojo.javaoneforall.javacore.introductionclasses.test;

import academy.devdojo.javaoneforall.javacore.introductionclasses.domain.Car;

public class CarTest01 {
    static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "FIAT";
        car1.model = "Fastback";
        car1.year = 2025;
        car2.name = "Honda";
        car2.model = "Civic";
        car2.year = 2025;

        System.out.println("\n-----------------------------Car 1-------------------------------\n");
        System.out.printf("Name: %s. %nModel: %s. %nYear: %s.%n", car1.name, car1.model, car1.year);
        System.out.println("\n-----------------------------Car 2-------------------------------\n");
        System.out.printf("Name: %s. %nModel: %s. %nYear: %s.", car2.name, car2.model, car2.year);

    }
}
