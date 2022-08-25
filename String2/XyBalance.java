package String2;
/*We'll say that a String is xy-balanced if for all the 'x' chars in the string,
there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.*/

public class XyBalance {
    public boolean xyBalance(String str) {
        int a = str.indexOf('x');
        int b = str.indexOf('y', a );
        if (a != -1 && b != -1 && a < b && str.charAt(str.length() - 1) != 'x') {
            return true;
        }
        if (a == -1 && b == -1 || str.length() == 1 && str.equals("y")) {
            return true;
        }
        return false;
    }
}
