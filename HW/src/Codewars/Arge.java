package Codewars;

public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int inh = (int) (p0 + p0 * (percent / 100) + aug);
        int count = 1;
        while (inh < p) {
            inh = (int) (inh + inh * (percent / 100) + aug);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
    }
}
