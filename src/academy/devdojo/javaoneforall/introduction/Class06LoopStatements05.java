package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements05 {
    static void main(String[] args) {
        double priceCar = 20000;
        for (int month = (int) priceCar; month >= 1; month--) {
            double monPrice = priceCar / month ;
            if (monPrice < 1000) {
                continue;
            }
            System.out.printf("Months = %d. Price = %f.%n", month, monPrice);
        }
    }
}
