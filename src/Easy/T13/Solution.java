package Easy.T13;

/**
 * @Title: 13. Roman to Integer
 * @Link: https://leetcode.com/problems/roman-to-integer/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/6
 * @Time: 下午5:53
 */

class Solution {
    public int romanToInt(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    res += (res >= 5 ? -1 : 1);
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    res += 10 * (res >= 50 ? -1 : 1);
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'C':
                    res += 100 * (res >= 500 ? -1 : 1);
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'M':
                    res += 1000;
                    break;
            }
        }
        return res;
    }

    /**
     * 测试用例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        //int ans = solution.romanToInt("III");//63
        int ans = solution.romanToInt("IX");//63
        //int ans = solution.romanToInt("LXIII");//63
        //int ans = solution.romanToInt("DCCVII");//707
        System.out.println(ans);
    }
}
