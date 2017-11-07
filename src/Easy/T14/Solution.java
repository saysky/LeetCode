package Easy.T14;

/**
 * @Title: 14. Longest Common Prefix
 * @Link: https://leetcode.com/problems/longest-common-prefix/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/7
 * @Time: 下午4:40
 */

public class Solution {

    /**
     * 描述：求一个字符串数组的最长公共前缀
     * 如输入 {"leetcode","leets","leet","leeds"} 返回 "leet"
     */

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++)
            while(strs[i].indexOf(pre) != 0)//如果没有匹配到
                pre = pre.substring(0,pre.length()-1);//leets-->leet-->lee
        return pre;
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        String[] strs = {"leets","leetcode","leet","leeds"};
        String ans = solution.longestCommonPrefix(strs);
        System.out.println(ans);
    }
}
