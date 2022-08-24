package String1;
//Given a string, return true if it ends in "ly".

public class EndsLy {
    public boolean endsLy(String str) {
        if (str.isEmpty() ||  str.length() < 2) {
            return false;
        }
        if (str.substring(str.length()-2,str.length()).equals("ly")) {
            return true;
        }
        return false;
    }
}
