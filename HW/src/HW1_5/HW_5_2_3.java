package HW1_5;

public class HW_5_2_3 {
    public static void main(String[] args) {
        for (int i = 9; i > -1; i--) {
            StringBuilder tmp = new StringBuilder();
            if (i < 9) tmp.append("  ".repeat(9 - i));
            for (int j = i; j > -1; j--) tmp.append(j).append(" ");
            for (int j = 1; j < i + 1; j++) tmp = new StringBuilder("%s%s".formatted(tmp.toString(), j + " "));
            System.out.println(tmp);
        }
    }
}
