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

    /**
     * 描述：给定一个罗马数字的字符串，将其转为阿拉伯数字
     * 如输入 III，返回 3
     * 如输入 IX，返回 9等
     *
     * 罗马数字普及
     * 1-5     I   II   III  IV  V
     * 6-10    VI  VII  VIII IX  X
     * 11-20   XI  XII  XIII IX  X
     *
     * 1    I    5   V
     * 10   X    50  L
     * 100  C    500 D
     * 1000 M
     *
     * 501 DI
     * 550 DL
     * 530 DXXX
     * 707 DCCVII
     */
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
        //int ans = solution.romanToInt("IX");//63
        //int ans = solution.romanToInt("LXIII");//63
        int ans = solution.romanToInt("DCCVII");//707
        System.out.println(ans);
    }
}
