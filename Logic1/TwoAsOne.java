package Logic1;
//Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

public class TwoAsOne {
    public boolean twoAsOne(int a, int b, int c) {
        int al = a + b;
        int cl = c + b;
        int ac = a + c;
        if (a == cl || b == al || c == al || b == ac) {
            return true;
        }
        return false;
    }
}
