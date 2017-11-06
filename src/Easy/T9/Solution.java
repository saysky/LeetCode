package Easy.T9;

/**
 * @Title: 9. Palindrome Number
 * @Link: https://leetcode.com/problems/palindrome-number/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/6
 * @Time: 下午5:06
 */

class Solution {

    /**
     *描述：给定一个整数，判断其是否为回文数(正反念一样的数字，如1221，12321等)
     * 如输入：1221 返回 true
     * 如输入：-1221(负数) 返回false
     * 是否需要考虑溢出呢？(似乎好像是不需要)
     */
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int y = x,ans=0;
        while(y!=0) {
            ans = ans*10+y%10;
            y /= 10;
        }
        return x==ans;
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        Boolean ans = solution.isPalindrome(12321);
        System.out.println(ans);
    }

}
