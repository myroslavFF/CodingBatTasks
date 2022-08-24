package Logic1;
/*We are having a party with amounts of tea and candy. Return the int outcome of the party encoded
as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5.
However, if either tea or candy is at least double the amount of the other one, the party is great (2).
However, in all cases, if either tea or candy is less than 5, the party is always bad (0). */

public class TeaParty {
    public int teaParty(int tea, int candy) {
        int doub = Math.abs(tea) - Math.abs(candy);
        int tw = Math.abs(doub);
        if (tea >= 5 && candy >= tea * 2 || candy >= 5 && tea >= candy * 2) return 2;
        if (tea >= 5 && candy >= 5) return 1;
        return 0;
    }
}
