package Easy.T136;

/**
 * @Title: 136. Single Number
 * @Link: https://leetcode.com/problems/single-number/description/
 * @Difficulty: Easy
 * @author 言曌
 * @date 2017/11/27 下午8:36
 */

class Solution {
    /**
     * 描述：给定一个整型数组，该数组除了一个元素只有一次，其他的元素都出现两次，返回这个只出现一次的元素
     * 如数组为[1,2,4,5,4,2,1]，返回 5
     * @param nums
     * @return
     */

    /**
     * 本体使用了 ^ 运算符(异或)
     * 十分巧妙
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++) {
            result ^= nums[i];
        }
        return result;
    }
}