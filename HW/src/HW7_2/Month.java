package HW7_2;

public class Month {

    private String monthName;
    private int numOfDays;
    private int numWorkDays;

    public Month(String monthName, int numOfDays, int numWorkDays) {
        this.monthName = monthName;
        this.numOfDays = numOfDays;
        this.numWorkDays = numWorkDays;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    public int getNumWorkDays() {
        return numWorkDays;
    }
}
