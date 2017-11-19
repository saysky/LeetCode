package Easy.T70;

/**
 * @Title: https://leetcode.com/problems/climbing-stairs/description/
 * @Link: 70. Climbing Stairs
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/15
 * @Time: 上午10:51
 */

public class Solution {

    /**
     *  描述：爬梯子，一次可以爬1步或者2步，总共有多少种爬法
     *  如输入 3，可以1+2,也可以2+1,还可以1+1+1,所有有三种爬法，返回3
     */

    /**
     *  每次只能迈出 1 步或者 2 步
     *  0  -->  0 (无)
     *  1  -->  1 (1)
     *  2  -->  2 (11,2)
     *  3  -->  3 (111,12,21)
     *  4  -->  5 (1111,112,121,211,22)
     *  5  -->  6 (11111,1112,1121,1211,2111,122,212,221)
     *  似乎是一个斐波拉契数列
     *  可以用动态规划方式做
     */

    public int climbStairs(int n) {
        // base cases
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int one_step_before = 2;
        int two_steps_before = 1;
        int sum = 0;

        for(int i=2; i<n; i++){
            sum = one_step_before + two_steps_before;
            two_steps_before = one_step_before;
            one_step_before = sum;
        }
        return sum;
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        int ans = solution.climbStairs(3);
        System.out.println(ans);
    }
}
