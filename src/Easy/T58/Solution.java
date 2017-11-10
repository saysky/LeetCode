package Easy.T58;

/**
 * @Title: 58. Length of Last Word
 * @Link: https://leetcode.com/problems/length-of-last-word/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/10
 * @Time: 下午2:08
 */

public class Solution {

    /**
     * 描述：求最后一个单词的长度
     * 如输入字符串 "hello world"，最后一个单词为"world"，返回5
     * 如输入字符串 "hello world  "，最后一个单词为"world",返回5
     * 如输入 "  "或""，返回0
     */
    public int lengthOfLastWord(String s) {
        int len = s.length(),count=0;
        //先去掉末尾的空格(相当于trim())
        while(len>0 && s.charAt(len-1)==' ') {
            len--;
        }
        //查找最后一个空格（相当于lastIndexOf()）
        while(len>0 && s.charAt(len-1)!=' ') {
            count++;
            len--;
        }

        return count;
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        //int ans = solution.lengthOfLastWord("");
        //int ans = solution.lengthOfLastWord("  ");
        //int ans = solution.lengthOfLastWord("bb aaa  ");
        int ans = solution.lengthOfLastWord("hello world");
        System.out.println(ans);
    }

}
