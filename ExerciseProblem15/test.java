/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: test
 * Author:   62701
 * Date:     2020/5/31 15:13
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
 * @create 2020/5/31
 * @since 1.0.0
 */
public class test {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next = node3;
        node3.next = node5;
        node2.next = node4;
        node4.next = node6;
        Solution.Merge(node1,node2);
        ListNode p = node1;
        while (p.next != null){
            System.out.println(p.val);
        }


    }
}