package Codewars;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String tmp = String.valueOf(name.charAt(0)).toUpperCase().concat(".");
        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) == ' ')
                name = tmp.concat(String.valueOf(name.charAt(i + 1)).toUpperCase());
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
    }
}
