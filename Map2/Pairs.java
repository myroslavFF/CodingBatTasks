package Map2;
/*Given an array of non-empty strings, create and return a Map<String, String> as follows:
for each string add its first character as a key with its last character as the value. */

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String st : strings) {
            if (!map.containsKey(st)) {
                map.put(st.substring(0, 1), st.substring(st.length() - 1));
            }
        }
        return map;
    }
}
