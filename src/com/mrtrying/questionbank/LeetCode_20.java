package com.mrtrying.questionbank;

import java.util.Stack;

public class LeetCode_20 {

    public static void main(String[] args) {
        String str = "()[]{}";
        Solution demo = new Solution();
        boolean result = demo.isValid(str);
        System.out.println(result);
    }

    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     * 有效字符串需满足：
     * 1.左括号必须用相同类型的右括号闭合。
     * 2.左括号必须以正确的顺序闭合。
     * <p>
     * 示例 1：
     * 输入：s = "()"
     * 输出：true
     * <p>
     * 示例 2：
     * 输入：s = "()[]{}"
     * 输出：true
     * <p>
     * 示例 3：
     * 输入：s = "(]"
     * 输出：false
     * <p>
     * 示例 4：
     * 输入：s = "([)]"
     * 输出：false
     * <p>
     * 示例 5：
     * 输入：s = "{[]}"
     * 输出：true
     */

    static class Solution {
        public boolean isValid(String s) {
            if (s == null || s == "" || s.length() % 2 != 0) {
                return false;
            }

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c == '('){
                    stack.push(')');
                }else if(c == '['){
                    stack.push(']');
                }else if(c == '{'){
                    stack.push('}');
                }else if(stack.isEmpty() || stack.peek() != c){
                    return false;
                }else{
                    stack.pop();
                }
            }

            return stack.isEmpty();
        }
    }
}
