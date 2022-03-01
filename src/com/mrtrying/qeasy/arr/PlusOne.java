package com.mrtrying.qeasy.arr;

import com.mrtrying.Utils;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 9};
        Solution solution = new Solution();
        int[] result = solution.plusOne(digits);
        Utils.printArr(result);
    }

    static class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (++digits[i] > 9) {
                    digits[i] = 0;
                } else {
                    return digits;
                }
            }
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
    }
}
