package Easy.T28;

/**
 * @Title: 28. Implement strStr()
 * @Link: https://leetcode.com/problems/implement-strstr/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/9
 * @Time: 下午1:42
 */

public class Solution {

    /**
     * 描述：实现查找字符串的位置(如indexOf()的实现)
     * 如输入"hello"和"ll" 返回2，如果没查到返回-1
     */
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++) {
            for(int j=0;;j++) {
                if(j == needle.length()) return i;
                if(haystack.charAt(i+j)!=needle.charAt(j))//nptice
                    break;
            }
        }
        return -1;
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        String haystack = "ssalaswlla";
        String needle = "ll";
        int ans = solution.strStr(haystack,needle);
        System.out.println(ans);
    }
}
