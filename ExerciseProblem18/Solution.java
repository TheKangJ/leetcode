/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution
 * Author:   62701
 * Date:     2020/5/30 17:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ExerciseProblem18;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/30
 * @since 1.0.0
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] elements = s.toCharArray();
        int flag = 0;
        int length =elements.length;
        int LOLS = 0;
        for (int i = 0; i < length; i++) {
            if (map.containsKey(elements[i])){
                flag = Math.max(flag,map.get(elements[i]));   //找出上一次出现elements[i]的位置
            }
            LOLS = Math.max(i-flag+1,LOLS);
            map.put(elements[i],i+1);
        }
        return LOLS;
    }
}