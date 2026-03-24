package academy.devdojo.javaoneforall.javacore.jfinalmodifier.test;

import academy.devdojo.javaoneforall.javacore.jfinalmodifier.domain.Car;
import academy.devdojo.javaoneforall.javacore.jfinalmodifier.domain.Ferrari;

public class CarTest01 {
    static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.SPEED_LIMIT);

        System.out.println(car.BUYER);
        car.BUYER.setName("Bob");
        System.out.println(car.BUYER);


        Ferrari ferrari = new Ferrari();
        ferrari.setName("Enzo");
        ferrari.print();
    }
}
