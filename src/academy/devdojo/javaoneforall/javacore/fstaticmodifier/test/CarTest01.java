package academy.devdojo.javaoneforall.javacore.fstaticmodifier.test;

import academy.devdojo.javaoneforall.javacore.fstaticmodifier.domain.Car;

public class CarTest01 {
    static void main(String[] args) {
        Car car01 = new Car("BMW M4", 290);
        Car car02 = new Car("Mercedes G63", 270);
        Car car03 = new Car("Fiar Fastback", 260);

        Car.setSpeedLimit(222);

        car01.print();
        car02.print();
        car03.print();
    }
}
