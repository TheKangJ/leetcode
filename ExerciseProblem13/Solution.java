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
package ExerciseProblem13;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/30
 * @since 1.0.0
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode listNode;
        ListNode listNode1;
        listNode = head;
        int index = 0;
        while (listNode != null && index < k){
            index++;
            listNode = listNode.next;
        }
        if (index<k){
            return null;
        }else {
            listNode1 = head;
            while (listNode!=null){
                listNode = listNode.next;
                listNode1 = listNode1.next;
            }
            return listNode1;
        }
    }
}