package Warmup1;
/*Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged.
 Note: use .equals() to compare 2 strings.*/
public class NotString {
    public String notString(String str) {
        String [] word = str.split(" ");
        if(word[0].equals("not") ) {return str;}
        return "not " + str;
    }
}
