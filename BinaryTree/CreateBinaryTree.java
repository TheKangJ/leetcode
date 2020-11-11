package BinaryTree;

import java.util.LinkedList;

/**
 * @author : 62701
 * @Title : CreateBinaryTree
 * @Description :
 * @date : 2020-08-31 11:26
 * @since : 1.0.0
 **/

public class CreateBinaryTree {
    public static TreeNode createBinaryTree(LinkedList<Integer> list) {
        TreeNode node = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Integer data = list.removeFirst();
        if (data!=null){
             node = new TreeNode(data);
            node.leftChild = createBinaryTree(list);
            node.rightChild = createBinaryTree(list);
        }
        return node;
    }

}
