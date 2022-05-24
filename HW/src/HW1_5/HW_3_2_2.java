package HW1_5;

public class HW_3_2_2 {
    public static void main(String[] args) {
        var i = 0;

        while (true) {
            var pow = (int)Math.pow(5, i);
            if (pow > 10000) break;
            System.out.println(pow);
            i++;
        }

        for (i = 5; i < 10000; i = i * 5) {
            System.out.println(i);
        }
    }

}
