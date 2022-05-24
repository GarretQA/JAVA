package Codewars;

public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (firstAttacker.equals(fighter1.name)) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health <= 0) break;
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
            }
        } else {
            while ((fighter1.health > 0) && (fighter2.health > 0)) {
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health <= 0) break;
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
            }
        }
        if (fighter1.health <= 0) return fighter2.name;
        return fighter1.name;
    }

    public static void main(String[] args) {
        System.out.println(Kata.declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Lew"));
    }
}
