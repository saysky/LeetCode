package Medium.T3;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: 3. Longest Substring Without Repeating Characters
 * @Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * @Difficulty: Medium
 * @Author: 言曌
 * @Date: 2017/11/5
 * @Time: 下午5:20
 */

class Solution {

    /**
     * 描述：求最长子串(没有字母重复)的长度
     * 如给定的字符串为"abcabcbb"，则最长子串为"abc"，返回3
     * 如给定的字符串为"bbbbb"，则最长子串为"b"，返回1
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(),ans=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0,j=0;j<n;j++) {
            if(map.containsKey(s.charAt(j))) {
                i = Math.max(i,map.get(s.charAt(j)));
            }
            map.put(s.charAt(j),j+1);//从1号位置开始存放
            ans = Math.max(ans, j-i+1);//距离 j-i+1
        }
        return ans;
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        String str = "abcabcbb";
        int ans = solution.lengthOfLongestSubstring(str);
        System.out.println(ans);
    }
}
