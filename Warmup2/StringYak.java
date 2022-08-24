package Warmup2;
/*Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
but the "a" can be any char. The "yak" strings will not overlap.*/

public class StringYak {
    public String stringYak(String str) {
        String ret = "";
        String [] word = str.split("yak");
        for (String g: word) {
            ret +=g;
        }
        return ret;
    }
}
