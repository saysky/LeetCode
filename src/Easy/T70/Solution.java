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
     *  0  -->  0 (无)
     *  1  -->  1 (1)
     *  2  -->  2 (11,2)
     *  3  -->  3 (111,12,3)
     *  4  -->  5 (1111,112,13,22,4)
     *  5  -->  6 (11111,1112,113,122,14,5)
     *
     */

    public int climbStairs(int n) {
        // base cases
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int one_step_before = 2;
        int two_steps_before = 1;
        int all_ways = 0;

        for(int i=2; i<n; i++){
            all_ways = one_step_before + two_steps_before;
            two_steps_before = one_step_before;
            one_step_before = all_ways;
        }
        return all_ways;
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
