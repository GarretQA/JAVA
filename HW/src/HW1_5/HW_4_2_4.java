package HW1_5;

public class HW_4_2_4 {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int counter = 0;
        for (String[] strings : array) {
            for (String string : strings) {
                if (!string.contains("е")) {
                    counter += 1;
                }
            }
        }
        System.out.println(counter);
    }
}
