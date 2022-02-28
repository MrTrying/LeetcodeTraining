package com.mrtrying.questionbank;

public class LeetCode_7 {

    public static void main(String[] args) {
        int num = 1534236469;
        int reverse = new Solution().reverse(num);
        System.out.println(reverse);
    }

    static class Solution {
        public int reverse(int x) {
            if(x < 10 && x > -10){
                return x;
            }
            int symbol = x >= 0 ? 1 : -1;
            x = Math.abs(x);
            int length = String.valueOf(x).length();
            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum += (x % 10) * Math.pow(10, length - i - 1);
                if(sum >= Integer.MAX_VALUE || sum <= Integer.MIN_VALUE){
                    return 0;
                }
                x /= 10;
            }
            return sum * symbol;
        }
    }
}
