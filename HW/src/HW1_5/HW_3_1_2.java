package HW1_5;

public class HW_3_1_2 {
    public static void main(String[] args) {
        int a = (int) ((Math.random() * (1000 - 1)) + 1);
        int b = (int) ((Math.random() * (1000 - 1)) + 1);
        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
    }
}
