package ExerciseProblem26;


import java.util.ArrayList;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-08-03 17:07
 * @since : 1.0.0
 **/

public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }


    static TreeNode KthNode(TreeNode pRoot, int k) {
        if (k<= 0 || pRoot == null ){
            return null;
        }
        // 把节点全部放在列表里
        ArrayList<TreeNode> arrays = preOrder(pRoot,new ArrayList<TreeNode>());
        if (arrays.size() < k){
            return null;
        }
        // 设置大小为K的数组
        TreeNode[] treeNodes = new TreeNode[k];
        // 取出列表的前K个节点
        int index = 0;
        for (int i = 0; i < k; i++) {
            treeNodes[i] = arrays.get(i);
        }
        for (int j = k; j < arrays.size(); j++) {
            // 取得treeNodes的最大节点值的位置
             index = findMaxTreeNodeLocation(treeNodes);
            if (arrays.get(j).val < treeNodes[index].val){
                treeNodes[index] = arrays.get(j);
            }
        }
        index = findMaxTreeNodeLocation(treeNodes);
        return treeNodes[index];
    }

    public static ArrayList<TreeNode> preOrder(TreeNode root, ArrayList<TreeNode> arrays) {
        if (root != null) {
            arrays.add(root);
            preOrder(root.left, arrays);
            preOrder(root.right, arrays);
        }
        return arrays;
    }
    public static int findMaxTreeNodeLocation(TreeNode[] treeNodes){
        TreeNode temp = treeNodes[0];
        int location = 0;
        for (int i = 1; i <treeNodes.length ; i++) {
            if (treeNodes[i].val > temp.val){
                temp = treeNodes[i];
                location = i;
            }
        }
        return location;

    }

}
