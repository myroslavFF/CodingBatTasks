package Map1;
/*Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
then set "c" to have the longer value. If the values exist and have the same length,
change them both to the empty string in the map. */

import java.util.Map;

public class MapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") &&  map.containsKey("b")) {
            if (map.get("a").length() == map.get("b").length()) {
                map.put("a","");
                map.put("b","");
            }
            if (map.get("a").length() > map.get("b").length() && map.containsKey("a")) {
                map.put("c", map.get("a"));
            }
            if (map.get("b").length() > map.get("a").length() && map.containsKey("a")) {
                map.put("c", map.get("b"));
            }
        }
        return map;
    }
}
