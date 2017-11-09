package Easy.T53;


/**
 * @Title: 53. Maximum Subarray
 * @Link: https://leetcode.com/problems/maximum-subarray/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/9
 * @Time: 下午2:36
 */

public class Solution {

    /**
     * 描述：给定一个整型数组，求出其最大子数组(连续的元素之和最大),返回最大值
     * 如输入数组{-2,1,-3,4,-1,2,1,-5,4}，其最大子数组为 {4,-1,2,1}，所以返回之和为6
     * 策略：动态规划
     */

    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i=1;i<nums.length;i++) {
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
            max = Math.max(dp[i],max);
        }
        return max;
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        int[] nums = {-1,2,1,-3,4,-1,2,1,-5,4};
        int ans = solution.maxSubArray(nums);
        System.out.println(ans);
    }
}
