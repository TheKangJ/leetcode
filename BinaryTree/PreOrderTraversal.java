package BinaryTree;

import java.util.ArrayList;

/**
 * @author : 62701
 * @Title : preOrderTraversal
 * @Description : 二叉树的先序遍历,存储到ArrayList中
 * @date : 2020-08-31 11:24
 * @since : 1.0.0
 **/

public class PreOrderTraversal {
    public static ArrayList<Integer> preOrderTraversal(TreeNode node,ArrayList<Integer> arrayList){
        if (node == null){
            return null;
        }else {
            System.out.println(node.data);
            arrayList.add(node.data);
            preOrderTraversal(node.leftChild,arrayList);
            preOrderTraversal(node.rightChild,arrayList);
            return arrayList;
        }

    }
}
