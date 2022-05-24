package HW7_1;

public class Employee {
    private static double BASE_SALARY;
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static double getBaseSalary() {
        return BASE_SALARY;
    }

    public static void setBaseSalary(double baseSalary) {
        BASE_SALARY = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
}
