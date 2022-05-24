package Codewars;

public class TrailingZeroes {
    public static int zeros(int n) {
        double kmax = Math.floor(Math.log(n) / Math.log(5.0));
        double zeroesNum = 0;
        for (int k = 1; k < kmax + 1; k++) {
            zeroesNum += Math.floor(n / Math.pow(5, k));

        }
        return (int) zeroesNum;
    }

    public static void main(String[] args) {
        System.out.println(zeros(14));
    }
}
