package academy.devdojo.javaoneforall.javacore.npolymorphism.domain;

public class Television extends Product{
    public static final double TAX_PERCENTAGE = 0.2;

    public Television(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating tax value for television");
        return price * TAX_PERCENTAGE;
    }
}
