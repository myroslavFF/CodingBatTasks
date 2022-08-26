package String2;
/*A sandwich is two pieces of bread with something in between.
Return the string that is between the first and last appearance of "bread" in the given string,
or return the empty string "" if there are not two pieces of bread.*/

public class GetSandwich {
    public String getSandwich(String str) {
        if (str.length() <= 9) {
            return "";
        }
        int first = str.indexOf('d');
        int second = str.lastIndexOf('b');
        return str.substring(first + 1,second);
    }
}
