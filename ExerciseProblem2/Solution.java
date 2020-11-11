/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution
 * Author:   62701
 * Date:     2020/5/28 23:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ExerciseProblem2;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/28
 * @since 1.0.0
 * <p>
 * 请实现一个函数，
 * 将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("We are happy");
        System.out.println(replaceSpace(str));
    }

    public static String replaceSpace(StringBuffer str) {
        ArrayList<String> arrayList = new ArrayList<>();
        int index = 0;
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (" ".equals(str.substring(i, i + 1))) {
                arrayList.add(str.substring(index, i));
                index = i + 1;
            }
        }
        arrayList.add(str.substring(index));
        System.out.println(arrayList);
        int arrayListLengh = arrayList.size();
        for (int i = 0; i < arrayListLengh; i++) {
            if (i < arrayListLengh - 1) {
                newStr = newStr + arrayList.get(i) + "%20";
            } else {
                newStr = newStr + arrayList.get(i);
            }
        }
        return newStr;
    }
}