package Easy.T69;

/**
 * @Title: 69. Sqrt(x)
 * @Link: https://leetcode.com/problems/sqrtx/description/
 * @Difficulty: Easy Medium Hard
 * @Author: 言曌
 * @Date: 2017/11/14
 * @Time: 上午11:33
 */

public class Solution {

    /**
     * 描述：实现开根方法 sqrt(x)
     * 如输入 4 返回 2
     * 如输入 8 返回 2(因为求整数，2.8舍去小数为2)
     * 策略：二分查找
     */
    public int mySqrt(int x) {
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        //int ans = solution.mySqrt(1);
        //int ans = solution.mySqrt(4);
        //int ans = solution.mySqrt(8);
        int ans = solution.mySqrt(2147395600);
        System.out.println(ans);
    }
}
