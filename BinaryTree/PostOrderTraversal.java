package BinaryTree;

import java.util.ArrayList;

/**
 * @author : 62701
 * @Title : PostOrderTraversal
 * @Description : 后序遍历
 * @date : 2020-09-05 15:57
 * @since : 1.0.0
 **/

public class PostOrderTraversal {
    public static ArrayList<Integer> PostOrderTraversal(TreeNode root, ArrayList<Integer> arrayList){
        if (root  == null){
            return null;
        }else{
            PostOrderTraversal(root.leftChild,arrayList);
            PostOrderTraversal(root.rightChild,arrayList);
            arrayList.add(root.data);
            return arrayList;
        }

    }
}
