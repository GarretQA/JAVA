package Codewars;

public class BreakCamelCase {
    public static String camelCase(String input) {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > 64 && input.charAt(i) < 91) {
                buffer.append(" ");
            }
            buffer.append(input.charAt(i));
        }
        return buffer.toString();
    }
}
