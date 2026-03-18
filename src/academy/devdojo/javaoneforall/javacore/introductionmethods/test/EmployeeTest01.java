package academy.devdojo.javaoneforall.javacore.introductionmethods.test;
import academy.devdojo.javaoneforall.javacore.introductionmethods.domain.EmployeeCalculateAverage;
import academy.devdojo.javaoneforall.javacore.introductionmethods.domain.Employee;


public class EmployeeTest01 {
    static void main(String[] args) {
        Employee employee = new Employee();
        EmployeeCalculateAverage employeeCalculateAverage = new EmployeeCalculateAverage();
        employee.name = "Silvio";
        employee.age = 18;
        employee.salaries = new double[] {2340,5400,3455};
        employee.printer();
        employeeCalculateAverage.employeeAverage(employee.salaries);
    }
}
