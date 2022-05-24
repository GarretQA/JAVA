package Codewars;

public class AnimalFeast {
    public static boolean feast(String beast, String dish) {
        char[] beastCharArray = beast.toCharArray();
        char[] dishCharArray = dish.toCharArray();
        return (beastCharArray[0] == dishCharArray[0]) &&
                (beastCharArray[beastCharArray.length - 1] == dishCharArray[dishCharArray.length - 1]);
    }
}
