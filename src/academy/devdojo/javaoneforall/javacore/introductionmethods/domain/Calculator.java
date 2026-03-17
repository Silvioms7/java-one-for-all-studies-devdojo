package academy.devdojo.javaoneforall.javacore.introductionmethods.domain;

public class Calculator {
    public void sumTwoNumber() {
        System.out.println(85343 + 7812);
    }

    public void subtractTwoNumbers() {
        System.out.println(235 - 213);
    }

    public void multiplyTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void printTwoNumbers2(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Can't divide by 0");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void changeTwoNumber(int num1, int num2) {
        num1 = 34;
        num2 = 65;
        System.out.println("Inside changeTwoNumber");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public void sumNumberArrays(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumNumberVarArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}

