package Java_Interveiw_Coding_Session;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapMethodSortMapByValue {

    /*
    45. Write a method that can sort the map by values
     */

    public Map<String, Integer> sortByValue(Map<String, Integer> map){
        List<Map.Entry<String, Integer>> list = new
                ArrayList(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        map = new LinkedHashMap();
        for(Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }
}
