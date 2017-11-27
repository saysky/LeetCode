package Easy.T121;

/**
 * @Title: 121. Best Time to Buy and Sell Stock
 * @Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 * @Difficulty: Easy
 * @Author: 言曌
 * @Date: 2017/11/20
 * @Time: 下午3:22
 */

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0,temp;
        for(int i=0;i<prices.length-1;i++) {
            for(int j=i+1;j<prices.length;j++) {
                temp = prices[j] - prices[i];
                if(temp <= 0)
                    break;
                max = Math.max(max,temp);
            }
        }
        return max;
    }
}
