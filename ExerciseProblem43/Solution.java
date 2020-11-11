package ExerciseProblem43;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : 62701
 * @Title : Solution
 * @Description : 判断是否有环
 * @date : 2020-09-28 09:23
 * @since : 1.0.0
 * {(A->B),(B->C),(C->A)}
 **/

public class Solution {
    public static void main(String[] args) {
        String string  = "{(A->B),(B->C),(C->A)}";
        System.out.println(isEncircle(string));
    }
    public static boolean isEncircle(String graph){
        int length = graph.length();
        if (length == 0){
            return  false;
        }
        Map<Character,Integer> map = new HashMap<>();
        graph = graph.replace("{", "");
        graph = graph.replace("}","");
        String[] strings = graph.split(",");
        char begin = strings[0].charAt(1);
        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(1);
            char lastChar = strings[i].charAt(4);
            if (map.containsKey(firstChar)){
                int value = map.get(firstChar);
                map.put(firstChar,value+1);
            }else {
                map.put(firstChar,1);
            }
            if (map.containsKey(lastChar)){
                int value = map.get(lastChar);
                map.put(lastChar,value+1);
            }else {
                map.put(lastChar,1);
            }
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()
             ) {
            if (entry.getKey() == begin){
                if (entry.getValue() == 2){
                    return true;
                }
            }else {
                if (entry.getValue() == 3){
                    return true;
                }
            }
        }
        return false;

    }
}
