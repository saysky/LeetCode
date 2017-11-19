package Easy.T101;

/**
 * @Title: 101. Symmetric Tree
 * @Link: https://leetcode.com/problems/symmetric-tree/description/
 * @Difficulty: Easy Medium Hard
 * @Author: 言曌
 * @Date: 2017/11/19
 * @Time: 上午9:01
 */

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

class Solution {

    /**
     * 描述：判断某个二叉树是否为对称的。
     * 如输入[1,2,2,3,4,4,3],即是二叉树
     *          1
     *         / \
     *        2   2
     *       / \  /\
     *      3  4 4  3
     *  则返回 false
     */
    public boolean isMirror(TreeNode p,TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val ==q.val)
            return isMirror(p.left,q.right) && isMirror(p.right,q.left);
        return false;
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

}
