package ExerciseProblem54;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-10-27 16:06
 * @since : 1.0.0
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 **/

public class Solution {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bad";
        System.out.println(CheckPermutation(s1,s2));
    }

    public static boolean CheckPermutation(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        Map<Character, Integer> map1 = new HashMap<>(length1);
        Map<Character, Integer> map2 = new HashMap<>(length2);

        for (int i = 0; i < length1; i++) {
            char c = s1.charAt(i);
            if (map1.containsKey(c)) {
                int value = map1.get(c);
                map1.put(c, value + 1);
            } else {
                map1.put(c, 1);
            }
        }
        for (int j = 0; j < length2; j++) {
            char key = s2.charAt(j);
            if (map2.containsKey(key)) {
                int value = map2.get(key);
                map2.put(key, value + 1);
            } else {
                map2.put(key, 1);
            }
        }
        if (map1.size()!= map2.size()){
            return false;
        }
        for (Map.Entry<Character, Integer> entry : map1.entrySet()
        ) {
            char key = entry.getKey();
            int value1 = entry.getValue();
            if (map2.containsKey(key)) {
                int value2 = map2.get(key);
                if (value1 == value2) {
                    continue;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
