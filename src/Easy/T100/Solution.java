package Easy.T100;

/**
 * @Title: 100. Same Tree
 * @Link: https://leetcode.com/problems/same-tree/description/
 * @Difficulty: Easy Medium Hard
 * @Author: 言曌
 * @Date: 2017/11/19
 * @Time: 上午8:50
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    /**
     * 描述：给定两个二叉树，判断是否各个节点相等
     *
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //if(p==null && q==null) return true;
        //if(p==null || q==null) return false;
        if(p==null || q==null) return (p==q);
        if(p.val == q.val)
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        return false;
    }


}
