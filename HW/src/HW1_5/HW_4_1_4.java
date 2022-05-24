package HW1_5;

public class HW_4_1_4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arrSum = 0;
        for (int j : array) {
            arrSum += j;
        }
        System.out.println((arrSum * 1.0) / array.length);
    }
}
