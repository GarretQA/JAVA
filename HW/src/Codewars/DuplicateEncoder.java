package Codewars;

public class DuplicateEncoder {
    static String encode(String word){
        char[] array = word.toLowerCase().toCharArray();
        int count = 0;
        StringBuilder str = new StringBuilder();
        for (char c : array) {
            count = 0;
            for (char value : array) {
                if (value == c) count = count + 1;
            }
            if (count > 1) str.append(")");
            else str.append("(");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("   ()(   "));
    }
}
//"))))())))"