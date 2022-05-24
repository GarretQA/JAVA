package HW1_5;

public class HW_5_2_1 {
    public static void main(String[] args) {

        for (int i = 9; i > -1; i--) {
            String tmp = "";
            for (int j = 1; j < i + 1; j++) tmp = "%s%s".formatted(tmp, j + " ");
            System.out.println(tmp);
        }
    }
}
