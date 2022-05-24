package Codewars;

import java.util.Arrays;

public class ArraySum {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = Arrays.stream(arr1).sum();
        sum += Arrays.stream(arr2).sum();

        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {10, 20, 30};
        System.out.println(arrayPlusArray(arr1, arr2));
    }
}
