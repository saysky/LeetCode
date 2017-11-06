package Easy.T1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: 1. Two Sum
 * @Link: https://leetcode.com/problems/two-sum/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/5
 * @Time: 下午5:09
 */

public class Solution {

    /**
     *描述:给定一个数组和一个整数，求该数组中的两个元素之和为该整数，返回两个元素的下标
     *如 数组nums={2,7,11,15},target=9 返回 {0,1};
     */

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int complements = target - nums[i];
            if(map.containsKey(complements)) {
                return new int[]{map.get(complements),i};
            }
            //为了便于使用get(int key)方法，我们将元素当做key，将下标当做value
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        int[] nums = {2,7,11,15};
        int[] ans = solution.twoSum(nums,9);
        for(int x:ans) {
            System.out.print(x+" ");
        }

    }
}
