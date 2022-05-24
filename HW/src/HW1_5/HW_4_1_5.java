package HW1_5;

public class HW_4_1_5 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}};
        int nestedArraySum = 0;

        for (int[] subArray : array) {
            for (int subArrValues : subArray) {
                nestedArraySum += subArrValues;
            }
        }
        System.out.println("Sum of array elements is " + nestedArraySum);
    }
}
