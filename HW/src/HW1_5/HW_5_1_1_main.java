package HW1_5;

public class HW_5_1_1_main {
    public static void main(String[] args) {
        HW_5_1_1_methods test = new HW_5_1_1_methods();
        int s = test.getSum(2,3);
        int d = test.getDiff(5,6);
        int m = test.getMulti(4,5);
        double div = test.getDiv(8,4);
        System.out.printf("Results are: %d %d %d %.2f%n", s, d, m, div);
    }
}
