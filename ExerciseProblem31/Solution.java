package ExerciseProblem31;

/**
 * @author : 62701
 * @Title : Solution
 * @Description :
 * @date : 2020-09-05 15:16
 * @since : 1.0.0
 *
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 **/
class TreeNode{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val){
        this.val = val;
    }
}

public class Solution {
    public static boolean HasSubTree(TreeNode root1, TreeNode root2){
        boolean result = false;
        //当Tree1和Tree2都不为空的时候，才进行比较，否则直接返回false
        if (root2 != null && root1 !=null){
            //如果找到了对应Tree2的根节点的点
            if (root1.val == root2.val){
                //以这个根节点为起点判断受否包含Tree2
                result = doesTree1HaveTree2(root1,root2);
            }
            //如果找不到，那么就再去root的左儿子当作起点，去判断是否包含Tree2
            if (!result){
                result = HasSubTree(root1.left,root2);
            }
            //如果还找不到，那么就再去root的右儿子当作七点，去判断是否包含Tree2
            if (!result){
                result = HasSubTree(root1.right,root2);
            }
        }
        //返回结果
        return result;
    }

    public static boolean doesTree1HaveTree2(TreeNode node1,TreeNode node2){
        return true;
    }
}
