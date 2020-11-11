/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: RedBlackTree
 * Author:   62701
 * Date:     2020/6/26 13:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package RedBlackTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 62701
 * @create 2020/6/26
 * @since 1.0.0
 */
public class RedBlackTree {

    private final int R = 0;
    private final int B = 1;
    private Node root = null;  // 红黑树的根节点

    class Node{
        int data;   // 存的具体数字
        int color  = R;
        Node left;
        Node right;
        Node parent;

        public Node(int data){
             this.data = data;
        }
    }

    // 插入部分
    public void insert(Node root, int data){  // root节点一定不为空，最开始就默认进去了
        if (root.data < data){ // 标识插入到右边
            if (root.right == null){
                root.right = new Node(data);
            }else{
                insert(root.right,data);
            }
        }else{
            if (root.left == null){
                root.left = new Node(data);
            }else {
                insert(root.left,data);
            }
        }
    }
    public void leftRotate(Node node){
        if (node.parent == null){
            Node E = root;
            Node S = E.right;

            // 移动S的左子树
            E.right = S.left;
            S.left.parent = E;

            //修改E的指针
            E.parent = S;

            // 修改S的指针
            S.left = E;
            S.parent = null;
        }
    }
}