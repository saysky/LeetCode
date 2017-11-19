package Easy.T104;

/**
 * @Title: 104. Maximum Depth of Binary Tree
 * @Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 * @Difficulty: Easy Medium Hard
 * @Author: 言曌
 * @Date: 2017/11/19
 * @Time: 上午9:14
 */


class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
}

class Solution {

    /**
     * 描述：求二叉树的最大深度
     * 如二叉树为
     *          1
     *         / \
     *        2   2
     *       / \  /\
     *      3  4 4  3
     *     /      \
     *    4        8
     * 的最大深度为 4
     */
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
