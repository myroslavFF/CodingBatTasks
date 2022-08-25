package String2;
//Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

public class BobThere {
    public boolean bobThere(String str) {
        int a = str.indexOf('b');
        int b = str.indexOf('b', a + 2);
        if (a != -1 && b != -1 && str.length() > 2 && Math.abs(a - b) <= 3 ) {
            return true;
        }
        return false;
    }
}
