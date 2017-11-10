package T26;

/**
 * @Title: 26. Remove Duplicates from Sorted Array
 * @Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/9
 * @Time: 下午1:18
 */

class Solution {

    /**
     * 描述：移除一个数组中的重复值，返回元素个数，空间复杂度需要为O(1)
     * 如 输入的数组 {1,1,2,3,3,4}
     * 则新数组的元素 {1,2,3,4} 返回4
     */
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        int[] nums = {1,3,3,4,4,5};
        int ans = solution.removeDuplicates(nums);
        for (int i=0;i<ans;i++) {
            System.out.print(nums[i] + " ");
        }
    }
}


