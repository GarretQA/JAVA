package HW1_5;

public class HW_3_1_3 {
    public static void main(String[] args) {
        var a = (int) ((Math.random() * (1000 - 1)) + 1);

        if (a > 10) {
            System.out.println("больше 10");
        }

        if (a < 100) {
            System.out.println("меньше 100");
        }

        if ((a / 2.0) > 20) {
            System.out.println("результат деления на 2 больше 20");
        }

        if (a >= 5 && a <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
    }
}
