package BinaryTree;

import java.util.ArrayList;

/**
 * @author : 62701
 * @Title : InOrderTraversal
 * @Description : 二叉树的中序遍历，并存储在ArrayList中
 * @date : 2020-09-05 15:42
 * @since : 1.0.0
 **/

public class InOrderTraversal {
    public static ArrayList<Integer> InorderTraversal(TreeNode treeNode,ArrayList<Integer> arrayList){
        if (treeNode == null){
            return null;
        }else{
            InorderTraversal(treeNode.leftChild,arrayList);
            arrayList.add(treeNode.data);
            InorderTraversal(treeNode.rightChild,arrayList);
            return arrayList;
        }
    }
}
