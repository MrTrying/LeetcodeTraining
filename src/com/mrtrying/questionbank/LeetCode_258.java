package com.mrtrying.questionbank;

public class LeetCode_258 {
    public static void main(String[] args) {
        int num = 38;
        Solution solution = new Solution();
        int result = solution.addDigits(num);
        System.out.println(result);
    }

    /**
     * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
     * <p>
     * 示例 1:
     * 输入: num = 38
     * 输出: 2
     * 解释: 各位相加的过程为：
     * 38 --> 3 + 8 --> 11
     * 11 --> 1 + 1 --> 2
     * 由于2 是一位数，所以返回 2。
     * <p>
     * 示例 2:
     * 输入: num = 0
     * 输出: 0
     */

    static class Solution {
        public int addDigits(int num) {
            int sum = 0;
            while (num >= 10) {
                sum += num % 10;
                num /= 10;
            }
            sum += num;
            return sum > 9 ? addDigits(sum) : sum;
        }
    }
}
