package Codewars;

public class Correct {
    public static String correct(String string) {
        return string.replace("1", "I").
                replace("5", "S").
                replace("0", "O");

    }

    public static void main(String[] args) {
        System.out.println(correct("1F-RUDYARD K1PL1NG"));
    }
}
