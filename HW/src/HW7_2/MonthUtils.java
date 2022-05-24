package HW7_2;

public class MonthUtils {
    private static Month[] MONTH_ARRAY = {
            new Month("Jan", 31, 16),
            new Month("Feb", 28, 19),
            new Month("Mar", 31, 22),
            new Month("Apr", 30, 21),
            new Month("May", 31, 18),
            new Month("Jun", 30, 21),
            new Month("Jul", 31, 21),
            new Month("Aug", 31, 23),
            new Month("Sep", 30, 22),
            new Month("Oct", 31, 21),
            new Month("Nov", 30, 21),
            new Month("Dec", 31, 22)};

    public static Month[] getMonthArray() {
        return MONTH_ARRAY;
    }
}


