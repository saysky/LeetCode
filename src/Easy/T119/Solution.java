package Easy.T119;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: 119. Pascal's Triangle II
 * @Link: https://leetcode.com/problems/pascals-triangle-ii/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/15
 * @Time: 上午10:06
 */

class Solution {

    /**
     * 描述：打印第 n 行的杨辉三角
     * 如输入 3，打印[1,3,3,1]
     */

    /**
     * 杨辉三角
     * 1
     * 1 1
     * 1 2 1
     * 1 3 3 1
     * 1 4 6 4 1
     * ...
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=1;i<=rowIndex;i++) {
            for(int j=i-1;j>=1;j--) {
                int temp = list.get(j-1) + list.get(j);
                list.set(j,temp);//notice
            }
            list.add(1);
        }
        return list;
    }

    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        //List<Integer> list = solution.getRow(0);
        //List<Integer> list = solution.getRow(1);
        List<Integer> list = solution.getRow(5);
        System.out.println(list);

    }
}
