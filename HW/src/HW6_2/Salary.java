package HW6_2;

import java.util.Arrays;


public class Salary {

    public static double getSum(Employee[] employeeArray) {
        return Arrays.stream(employeeArray).mapToDouble(employee -> employee.salary).sum();
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.setSalary(2500.00);
        employee2.setSalary(1500.00);
        employee3.setSalary(1000.00);
        Employee[] employeeArray = {employee1, employee2, employee3};
        System.out.println(Salary.getSum(employeeArray));
    }
}
