package Logic1;
/*Return the sum of two 6-sided dice rolls, each in the range 1..6.
However, if noDoubles is true, if the two dice show the same value,
increment one die to the next value, wrapping around to 1 if its value was 6.*/

public class WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (die1 == 6 &&  die2 == 6 && noDoubles) {
            return die1 +1;
        }
        if (die1 == die2 && noDoubles) {
            return die1 + die2  + 1;
        }
        if (!noDoubles || noDoubles && die1 >= 1 && die2 <=6) {
            return die1 + die2;
        }
        return die1 + die2 + 1;
    }
}
