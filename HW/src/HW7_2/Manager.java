package HW7_2;

public class Manager extends Employee{

    private int numOfSubordinates;

    public Manager(String name, int age, char gender, double salaryPerDay, int numOfSubordinates) {
        super(name, age, gender, salaryPerDay);
        this.numOfSubordinates = numOfSubordinates;
    }

    public int getNumOfSubordinates() {
        return numOfSubordinates;
    }

    public void setNumOfSubordinates(int numOfSubordinates) {
        this.numOfSubordinates = numOfSubordinates;
    }

    public double getSalary(Month[] monthArray) {
        double sumSalary = 0;
        for (Month month: monthArray) {
            sumSalary += month.getNumWorkDays() * getSalaryPerDay() +
                    getNumOfSubordinates() * 0.01 * (month.getNumWorkDays() * getSalaryPerDay());
        }
        return sumSalary;
    }
}
