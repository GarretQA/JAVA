package HW1_5;

public class HW_4_1_6 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}
        };
        int maxElement = Integer.MIN_VALUE;

        for (int[] nestedArray : array) {
            for (int nestedArrayValue : nestedArray) {
                if (maxElement < nestedArrayValue) {
                    maxElement = nestedArrayValue;
                }
            }
        }
        System.out.println("Array maximum value is: " + maxElement);
    }
}
