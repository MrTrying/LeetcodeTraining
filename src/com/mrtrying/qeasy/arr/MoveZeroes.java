package com.mrtrying.qeasy.arr;

import com.mrtrying.Utils;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
    }

    static class Solution {
        public void moveZeroes(int[] nums) {
            int pos = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    pos++;
                } else if (pos != 0) {
                    nums[i - pos] = nums[i];
                    nums[i] = 0;
                }
            }
            Utils.printArr(nums);
        }
    }
}
