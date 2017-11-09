package Easy.T35;

/**
 * @Title: 35. Search Insert Position
 * @Link: https://leetcode.com/problems/search-insert-position/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/9
 * @Time: 下午2:10
 */

public class Solution {

    /**
     * 描述：从有序数组中查找一个数的下标，如果找不到，返回如果插入的话的下标
     * 如 输入数组{1,3,5,7}，查找5，能找到，返回下标2
     * 如 输入数组{1,3,5,7}，查找4，找不到,如果插入进去使其有序的话，应该插的位置为2,则返回2
     * 策略：二分查找
     */
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (target == nums[mid]) {
                return mid;
            } else if(target > nums[mid]){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        int[] nums = {1,3,5,7};
        //int ans =  solution.searchInsert(nums,8);
        //int ans =  solution.searchInsert(nums,0);
        int ans =  solution.searchInsert(nums,3);
        System.out.println(ans);
    }
}
