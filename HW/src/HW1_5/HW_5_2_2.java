package HW1_5;

public class HW_5_2_2 {
    public static void main(String[] args) {
        for (int i = 9; i > -1; i--) {
            StringBuilder tmp = new StringBuilder();
            if (i < 9) tmp = new StringBuilder("  ".repeat(9 - i));
            for (int j = i; j > -1; j--) tmp.append(j).append(" ");
            System.out.println(tmp);
        }
    }
}
