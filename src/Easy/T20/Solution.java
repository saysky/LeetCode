package Easy.T20;

import java.util.Stack;

/**
 * @Title:
 * @Link:
 * @Difficulty: Easy Medium Hard
 * @Author: 言曌
 * @Date: 2017/11/7
 * @Time: 下午6:34
 */

public class Solution {

    /**
     * 描述：给一个全是括号的字符串，判断括号是否匹配
     * 如输入 ({[]}) 或者 ([]){} 返回 true
     * 如输入 ([)] 则返回 false
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }


    /**
     * 测试示例
     * @param args
     */
    public static void main(String args[]) {
        Solution solution = new Solution();
        Boolean ans = solution.isValid("([{}])");
        System.out.println(ans);
    }
}
