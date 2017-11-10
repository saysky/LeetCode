package Easy.T66;

/**
 * @Title: 66. Plus One
 * @Link: https://leetcode.com/problems/plus-one/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/10
 * @Time: 下午2:37
 */

public class Solution {

    /**
     * 描述：给定一个非空的整数数组，把这个数组理解为一个整数，然后+1，然后新的数组
     * 如输入 {1,2,3} 返回 {1,2,4}
     * 如输入 {9,9,9} 返回 {1,0,0,0}
     */
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;//结束
            }
            digits[i] = 0;
        }
        //99999这种情况
        int []newNums = new int[digits.length+1];
        newNums[0]=1;
        return newNums;
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        //int[] digits = {1,2};
        //int[] digits = {1,9};
        int[] digits = {9,9};
        int[] ans = solution.plusOne(digits);
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
