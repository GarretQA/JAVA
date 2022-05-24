package HW7_2;

public class Employee {
    private String name;
    private int age;
    private char gender;
    private double salaryPerDay;

    public Employee(String name, int age, char gender, double salaryPerDay) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public double getSalary(Month[] monthArray) {
        double sumSalary = 0;
        for (Month month : monthArray) {
            sumSalary += month.getNumWorkDays() * getSalaryPerDay();
        }
        return sumSalary;
    }
}

