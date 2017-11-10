package Easy.T67;

/**
 * @Title: 67. Add Binary
 * @Link: https://leetcode.com/problems/add-binary/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/10
 * @Time: 下午3:14
 */

public class Solution {

    /**
     * 描述：二进制求和
     * 如输入 "01"和"10"，返回"11"
     * 如输入 "11"和"1"，返回"100"
     */
    public String addBinary(String a, String b) {
        int i = a.length()-1,j = b.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0) {
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';//char值转int值
            if(j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum/2;
        }
        //最后一位进位
        if (carry == 1) sb.append(1);
        return sb.reverse().toString();
    }


    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        //String ans = solution.addBinary("10","01");
        String ans = solution.addBinary("11","11");
        System.out.println(ans);
    }
}
