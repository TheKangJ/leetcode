/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Test
 * Author:   62701
 * Date:     2020/5/28 23:37
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
 */
public class Test {
    public static void main(String[] args) {
        String str = "We Are Happy now";
        ArrayList<String> arrayList = new ArrayList<>();
        int index = 0;
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (" ".equals(str.substring(i, i + 1))) {
                arrayList.add(str.substring(index, i));
                index = i+1;
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

        System.out.println(newStr);
    }
}