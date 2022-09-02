package Map2;
/*Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
with the value of all the strings starting with that character appended together in the order they appear in the array.*/

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String st : strings) {
            if (!map.containsKey(st.substring(0, 1))) {
                map.put(st.substring(0, 1), st);
            } else {
                String temp = map.get(st.substring(0, 1));
                map.put(st.substring(0, 1), temp + st);
            }
        }
        return map;
    }
}
