// 03/14/2026
package academy.devdojo.javaoneforall.introduction;

public class Class04Operators {
    static void main(String[] args) {

        // +, -, %, /, *

        int number1 = 54;
        int number2 = 6540;
        System.out.println(number2 + number1);
        System.out.println(number2 - number1);
        System.out.println(number2 % number1);
        System.out.println(number2 / number1);
        System.out.println(number2 * number1);

        System.out.println("------------------------------------------");

        // <, >, <=, >=, !=, ==

        boolean isTenLowerThanTwenty = number1 < number2;
        boolean isTenGreaterThanTwenty = number1 > number2;
        boolean isTenLowerOrEqualsThanTwenty = number1 <= number2;
        boolean isTenGreaterOrEqualsThanTwenty = number1 >= number2;
        boolean isTenDifferentThanTwenty = number1 != number2;
        boolean isTenEqualsThanTwenty = number1 == number2;
        System.out.println("isTenLowerThanTwenty           :" + isTenLowerThanTwenty);
        System.out.println("isTenGreaterThanTwenty         :" + isTenGreaterThanTwenty);
        System.out.println("isTenLowerOrEqualsThanTwenty   :" + isTenLowerOrEqualsThanTwenty);
        System.out.println("isTenGreaterOrEqualsThanTwenty :" + isTenGreaterOrEqualsThanTwenty);
        System.out.println("isTenDifferentThanTwenty       :" + isTenDifferentThanTwenty);
        System.out.println("isTenEqualsThanTwenty          :" + isTenEqualsThanTwenty);

        System.out.println("------------------------------------------");

        // && (and) // OR

        int age = 21;
        float salary = 23435f;
        boolean isLegalOlderThanThirty = age >= 20 && salary >= 25946;
        boolean isLegalYoungerThanThirty = age >= 22 && salary >= 19536;
        System.out.println("isLegalOlderThanThirty   : " + isLegalOlderThanThirty);
        System.out.println("isLegalYoungerThanThirty : " + isLegalYoungerThanThirty);

        double currentAccount = 500;
        double savingsAccount = 645;
        float ps5 = 644;
        boolean canBeBought = currentAccount > ps5 || savingsAccount > ps5;
        System.out.println("canBeBought : " + canBeBought);

        System.out.println("------------------------------------------");

        // =, +=, -=, *=, /=, %=

        double bonus = 100;
        bonus *= 2;
        System.out.println(bonus);
        bonus += 2000;
        System.out.println(bonus);
        bonus -= 1400;
        System.out.println(bonus);
        bonus /= 8;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);

        System.out.println("------------------------------------------");

        // Unary ++, --

        int counter = 22;
        counter++; // or ++counter, but is different, first add it up, then save it!
        System.out.println(++counter);
            counter--; // or --counter, but is different, subtract first, then save!
        System.out.println(--counter);
    }
}
