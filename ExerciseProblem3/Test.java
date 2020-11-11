/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Test
 * Author:   62701
 * Date:     2020/5/29 8:24
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
 *
 * 4 1 2 3
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        ListNode listNode1 = new ListNode(1);

        ListNode listNode2 = new ListNode(2);

        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode2;

        listNode2.next = listNode3;

        ListNode index = listNode1;

        ListNode listNode4 = new ListNode(4);
        listNode4.next = listNode1;

        ListNode listNode5 = new ListNode(5);
        listNode5.next = listNode4.next;
        listNode4.next = listNode5;



    }


}