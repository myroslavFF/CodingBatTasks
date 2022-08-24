package Logic1;
/*Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10
gives the right digit.)*/

public class ShareDigit {
    public boolean shareDigit(int a, int b) {
        int lefDigitA = a / 10;
        int rigthDigitA = a % 10;
        int lefDigitB = b / 10;
        int rigthDigitB = b % 10;
        if (lefDigitA == lefDigitB ||rigthDigitA == rigthDigitB ||
            lefDigitA == rigthDigitB ||lefDigitA == rigthDigitB || rigthDigitA == lefDigitB) {
            return true;
        }
        return false;
    }
}
