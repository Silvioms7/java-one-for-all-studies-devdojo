package academy.devdojo.javaoneforall.javacore.bintroductionmethods.test;
import academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain.EmployeeCalculateAverage;
import academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain.Employee;


public class EmployeeTest01 {
    static void main(String[] args) {
        Employee employee = new Employee();
        EmployeeCalculateAverage employeeCalculateAverage = new EmployeeCalculateAverage();
        employee.setName("Silvio");
        employee.setAge(18);
        employee.setSalaries(new double[] {2340,5400,3455});
        employee.printer();
        employeeCalculateAverage.employeeAverage(employee.getSalaries());
    }
}
