/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution
 * Author:   62701
 * Date:     2020/5/29 9:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ExecriseProblem4;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/5/29
 * @since 1.0.0
 *
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */
public class Solution {
    public static void main(String[] args) {

    }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        if(pre.length ==0){
            return null;
        }

        int rootVal = pre[0];

        if(pre.length ==1){
            return new TreeNode(rootVal);
        }
        //我们先找到root所在的位置，确定好前序和中序中左子树和右子树列的范围
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = 0;
        for (int i = 0; i <in.length ; i++) {
            if(rootVal == in[i]){
                rootIndex = i;
                break;
            }
        }

        //递归，假设root的左右子树都已经构建完毕，那么只要想左右子树安到root左右即可。
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,rootIndex+1),Arrays.copyOfRange(in,0,rootIndex));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,rootIndex+1,pre.length),Arrays.copyOfRange(in,rootIndex+1,in.length));

        return root;
    }
}