package HW1_5;

public class HW_4_1_7 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}
        };
        int nestedArrlength = 0;
        for (int[] nestedArr: array) {
            nestedArrlength += nestedArr.length;
        }
        System.out.println(nestedArrlength);
    }
}
