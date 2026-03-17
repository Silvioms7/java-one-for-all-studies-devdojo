package academy.devdojo.javaoneforall.javacore.introductionmethods.test;

import academy.devdojo.javaoneforall.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest01 {
    static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumTwoNumber();
        System.out.println("------------------");

        calculator.subtractTwoNumbers();

        System.out.println("------------------");

        calculator.multiplyTwoNumbers (236, 423);

        System.out.println("------------------");

        double result = calculator.divideTwoNumbers(23, 5);
        System.out.println(result);

        System.out.println("------------------");

        calculator.printTwoNumbers2(23,0);

        System.out.println("------------------");

        int num1 = 1;
        int num2 = 1;

        calculator.changeTwoNumber(num1, num2);

        System.out.println("Outside changeTwoNumber");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);

        System.out.println("------------------");

        int[] numbers = {234,3453};
        calculator.sumNumberArrays(numbers);
        calculator.sumNumberVarArgs(numbers);
    }
}
