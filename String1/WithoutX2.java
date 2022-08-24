package String1;

public class WithoutX2 {
    public String withoutX2(String str) {
        if (str.isEmpty() || str.length()==1) {
            return "";
        }
        if (str.length() >=2 && str.substring(0, 2).equals("xx") ) {
            return str.substring(2);
        }
        if (str.substring(1, 2).equals("x") ) {
            return str.substring(0, 1) + str.substring(2);
        }
        if (str.substring(0, 1).equals("x") ) {
            return str.substring(1);
        }
        return str;
    }
}
