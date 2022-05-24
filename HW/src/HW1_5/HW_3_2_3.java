package HW1_5;

public class HW_3_2_3 {
    public static void main(String[] args) {
        for (int i = 40; i < 61; i++) {
            if (i % 4 == 0) System.out.println(i);
        }

        for (int i = 40; i <= 60; i += 4) {
            System.out.println(i);
        }
    }
}
