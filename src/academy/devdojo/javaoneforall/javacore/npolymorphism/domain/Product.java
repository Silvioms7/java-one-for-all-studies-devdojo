package academy.devdojo.javaoneforall.javacore.npolymorphism.domain;

public abstract class Product implements Taxble{
    protected String name;
    protected double price;

    public Product(String name, double value) {
        this.name = name;
        this.price = value;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

