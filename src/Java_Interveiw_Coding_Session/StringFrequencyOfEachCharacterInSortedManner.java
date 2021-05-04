package Java_Interveiw_Coding_Session;

import java.util.Map;
import java.util.TreeMap;

public class StringFrequencyOfEachCharacterInSortedManner {
    /*
    44. Return the frequency of each character in the given string in Sorted
    manner
    Ex:
    Input: DDDAACCCCCCB
    Output: A2B1C6D3
     */

    public String frequencyOfCharacterInSortedManner(String str){
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String each : str.split("")) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        str = "";
        for(Map.Entry<String, Integer> each: map.entrySet()){
            str += each.getKey()+each.getValue();
        }
        return str;
    }
}
