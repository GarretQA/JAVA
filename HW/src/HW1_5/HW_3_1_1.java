package HW1_5;

public class HW_3_1_1 {
    public static void main(String[] args) {
        int a = (int) ((Math.random() * (1000 - 1)) + 1);
        int b = (int) ((Math.random() * (1000 - 1)) + 1);
        if (a < b) {
            System.out.println("a < b");
        } else if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a > b");
        }
    }
}
