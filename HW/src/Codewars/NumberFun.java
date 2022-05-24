package Codewars;

public class NumberFun {
    public static long findNextSquare(long sq) {
        if ((sq % Math.sqrt(sq) == 0)) {
            return (long) Math.pow((Math.sqrt(sq) + 1), 2);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findNextSquare(114));
    }
}
