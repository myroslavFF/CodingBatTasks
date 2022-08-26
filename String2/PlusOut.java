package String2;
/*Given a string and a non-empty word string, return a version of the original String where all chars have been
replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged. */

public class PlusOut {
    public String plusOut(String str, String word) {
        String wo="";
        for(int i = 0; i < str.length(); i++){
            if(i < str.length() - word.length() + 1 && str.substring(i, i+word.length()).equals(word)){
                wo = wo+word;
                i = i + word.length() - 1;
            }
            else{
                wo = wo + "+";
            }

        }
        return wo;
    }
}
