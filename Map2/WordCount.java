package Map2;
/*The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
with a key for each different string, with the value the number of times that string appears in the array. */

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String st : strings) {
            if (!map.containsKey(st)) {
                map.put(st,1);
            } else {
                int temp = map.get(st) + 1;
                map.put(st, temp);
            }
        }
        return map;
    }
}
