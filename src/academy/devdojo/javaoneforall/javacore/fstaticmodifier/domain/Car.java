package academy.devdojo.javaoneforall.javacore.fstaticmodifier.domain;

public class Car {
    private String name;
    private int maxSpeed;
    private static int speedLimit = 250;

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("------------------------");
        System.out.println("Name: " + name);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Speed limit: " + Car.speedLimit);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static int getSpeedLimit() {
        return speedLimit;
    }

    public static void setSpeedLimit(int speedLimit) {
        Car.speedLimit = speedLimit;
    }
}
