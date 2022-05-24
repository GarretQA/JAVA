package Codewars;

import java.util.Arrays;

public class Solution {
    public static String[] stringToArray(String s) {
        String[] arr = s.split(" ");
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Some shit happens")));
    }

}
