/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution
 * Author:   62701
 * Date:     2020/5/29 8:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ExerciseProblem3;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/29
 * @since 1.0.0
 *输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *
 */
public class Solution {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode index = listNode;
        int length = 0;
        while (index != null){
            arrayList.add(index.val);
            index = index.next;
            length ++;
        }
        for (int i = 0; i <length/2 ; i++) {
            int temp = arrayList.get(i);
            arrayList.set(i,arrayList.get(length -1 -i));
            arrayList.set(length -1 -i,temp);
        }
        return arrayList;
    }
}