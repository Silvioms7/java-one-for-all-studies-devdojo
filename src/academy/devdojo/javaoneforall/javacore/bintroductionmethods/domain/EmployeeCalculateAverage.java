package academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain;
public class EmployeeCalculateAverage {
    public void employeeAverage(double... salaries) {
        if (salaries == null) return;
        double sum = 0;
        for (double i : salaries) {
            sum += i;
        }
        sum /= salaries.length;
        System.out.printf("\nAverage salaries: %.2f", sum);
    }
}
