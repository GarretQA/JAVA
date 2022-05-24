package HW7_1;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getSalary() {
        return Employee.getBaseSalary();
    }
}
