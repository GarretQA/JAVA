package HW1_5;

public class HW_4_2_1 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'о'){
                result = result + s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
