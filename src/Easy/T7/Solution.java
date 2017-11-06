package Easy.T7;

/**
 * @Title: 7. Reverse Integer
 * @Link: https://leetcode.com/problems/reverse-integer/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/5
 * @Time: 下午5:08
 */

public class Solution {
    /**
     * 描述：将一个整数按位求反，32位机器溢出的整数，返回0
     * 如输入 123 返回 321
     * 输入 -123 返回 -321
     * 输入 120 返回 21
     * 输入 1534236469 返回 0
     */

    public int reverse(int x)
    {
        int result = 0;
        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            //如果newResult溢出,超过21亿(32位机器int最大范围),则返回0
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }

    /**
     * 测试实示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        //int ans = solution.reverse(123);//321
        //int ans = solution.reverse(120);//21
        //int ans = solution.reverse(-123);//-321
        int ans = solution.reverse(1534236469);//0
        System.out.println(ans);
    }
}
