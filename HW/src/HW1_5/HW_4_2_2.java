package HW1_5;

public class HW_4_2_2 {
    public static void main(String[] args) {
        String s = "Re-election of elected president";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'e') counter += 1;
        }
        System.out.println(counter);
    }
}
