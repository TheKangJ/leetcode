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
package ExerciseProblem15;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/30
 * @since 1.0.0
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 */
public class Solution {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode mergeHead = null;
        ListNode current = null;
        if (list1.val < list2.val){
            mergeHead = list1;
        }else {
            mergeHead = list2;
        }
        if (mergeHead == list1){
            list1 = list1.next;
        }else {
            list2 = list2.next;
        }
        current = mergeHead;
        while (list1 != null && list2!= null){
            if (list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
                current = current.next;
            }else {
                current.next = list2;
                list2 = list2.next;
                current = current.next;
            }

        }
        if (list1==null){
            current.next = list2;
        }else{
            current.next = list1;
        }
        return mergeHead;
    }
}