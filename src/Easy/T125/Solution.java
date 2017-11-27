package Easy.T125;

/**
 * @Title: 125. Valid Palindrome
 * @Link: https://leetcode.com/problems/valid-palindrome/description/
 * @Difficulty: Easy
 * @author 言曌
 * @date 2017/11/27 下午8:07
 */

class Solution {

    /**
     * 描述：给定一个字符串(只关心字符串中的字母和数字)，判断其是否为回文字符串
     * 如 "A man, a plan, a canal: Panama" 是回文的
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }

}
