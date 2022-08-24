package Logic2;
/*Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
Return 0 if they both go over. */

public class Blackjack {
    public int blackjack(int a, int b) {
        int num = Math.max(a, b);
        int num1 = Math.min(a, b);
        if (num <= 21) {
            return num;
        }
        if (num1 <= 21) {
            return num1;
        }
        return 0;
    }
}
