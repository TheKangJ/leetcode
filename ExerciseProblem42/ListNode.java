package ExerciseProblem42;

/**
 * @author : 62701
 * @Title : LisrNode
 * @Description : 节点结构
 * @date : 2020-09-25 16:44
 * @since : 1.0.0
 **/

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}