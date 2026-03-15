package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements04 {
    static void main(String[] args) {
        double priceCar = 20000;
        for (int month = 1; month <= priceCar; month++) {
            double monPrice = priceCar / month ;
            if (monPrice < 1000) {
                break;
            }
            System.out.printf("Months = %d. Price = %f.%n", month, monPrice);
//            if (monPrice >= 1000) {
//                System.out.printf("Months = %d. Price = %f.%n", month, monPrice);
//            } else {
//                break;
//            }
        }
    }
}
