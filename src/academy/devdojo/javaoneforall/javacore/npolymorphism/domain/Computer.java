package academy.devdojo.javaoneforall.javacore.npolymorphism.domain;

public class Computer extends Product {
    public static final double TAX_PERCENTAGE = 0.2;

    public Computer(String name, double value) {
        super(name, value);
    }


    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating tax value for computer");
        return price * TAX_PERCENTAGE;
    }
}
