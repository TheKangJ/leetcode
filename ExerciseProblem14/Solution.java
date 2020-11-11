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
package ExerciseProblem14;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/30
 * @since 1.0.0
 */
public class Solution {
    public static ListNode ReverseList(ListNode head) {
        if (head == null){
            return null;
        }else if (head.next == null){
            return head;
        }
        ListNode rear = head;
        ListNode p= head;
        while (rear.next != null) {
            rear = rear.next;
        }
        while (head != rear) {
            head = head.next;
            p.next=rear.next;
            rear.next=p;
            p = head;
        }
        return rear;
    }
}