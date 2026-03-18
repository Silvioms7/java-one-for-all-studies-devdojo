package academy.devdojo.javaoneforall.javacore.introductionmethods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void printer() {
        if (salaries == null) return;
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.print("Salaries: ");
        for (double salary : this.salaries) {
            System.out.print(salary + "; ");
        }
//        employeeAverage();
    }
//    public void employeeAverage(double... salaries) {
//        double sum = 0;
//        for (double i : salaries) {
//            sum += i;
//        }
//          sum /= salaries.length;
//        System.out.printf("\nAverage salaries: %.2f", sum);
//    }
}



