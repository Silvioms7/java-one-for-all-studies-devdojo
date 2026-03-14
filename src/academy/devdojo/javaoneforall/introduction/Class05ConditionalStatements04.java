// 03/14/2026
package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements04 {
    static void main(String[] args) {
        double annualSalary = 70000D;
        double tax =    annualSalary <= 34712 ? annualSalary * 0.097 :
                        annualSalary <= 68507 ? annualSalary * 0.3735 :
                        annualSalary * 0.495;
        System.out.println(tax);
    }
}
