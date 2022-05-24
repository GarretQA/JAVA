package HW7_1;

public class Director extends Manager {
    public Director(String name, double salary, int numberOfSubordinates) {

        super(name, salary, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        return Manager.getBaseSalary() * (getNumberOfSubordinates() / 100 * 9);
    }
}
