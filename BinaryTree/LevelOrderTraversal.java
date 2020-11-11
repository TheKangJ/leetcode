package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : 62701
 * @Title : LevelOrderTraversal
 * @Description : 层序遍历
 * @date : 2020-09-05 16:50
 * @since : 1.0.0
 **/

public class LevelOrderTraversal {
    public static void LevelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            root = queue.remove();
            System.out.println(root.data + " ");
            if (root.leftChild!= null){
                queue.add(root.leftChild);
            }
            if (root.rightChild!= null){
                queue.add(root.rightChild);
            }
        }
    }
}
