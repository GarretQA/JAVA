package HW6_2;

import org.jetbrains.annotations.NotNull;

public class Employee {
    private String name;
    private int age;
    private boolean gender;
    double salary;

    public Employee(String name, int age, boolean gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public Employee() {
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setGender(boolean transGender) {
        this.gender = transGender;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isSameName(@NotNull Employee employee) {
        return (this.name).equals(employee.name);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Garret", 36, true, 3500.00);
        Employee employee2 = new Employee();
        employee2.setName("Garret");
        employee2.setAge(22);
        employee2.setGender(false);
        employee2.setSalary(2200.00);
        System.out.println(employee2.isSameName(employee1));
    }
}
