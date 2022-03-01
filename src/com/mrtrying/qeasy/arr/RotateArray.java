package com.mrtrying.qeasy.arr;

import com.mrtrying.Utils;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        Solution solution = new Solution();
        solution.rotate(nums, k);
    }

    /**
     * 给你一个数组，将数组中的元素向右轮转 k个位置，其中k是非负数。
     *
     *
     * 示例 1:
     * 输入: nums = [1,2,3,4,5,6,7], k = 3
     * 输出: [5,6,7,1,2,3,4]
     * 解释:
     * 向右轮转 1 步: [7,1,2,3,4,5,6]
     * 向右轮转 2 步: [6,7,1,2,3,4,5]
     * 向右轮转 3 步: [5,6,7,1,2,3,4]
     *
     */
    static class Solution {
        public void rotate(int[] nums, int k) {
            int[] rotateNums = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                rotateNums[(i+k)%nums.length] = nums[i];
            }
            for (int i = 0; i < rotateNums.length; i++) {
                nums[i] = rotateNums[i];
            }

            Utils.printArr(nums);
        }
    }

}
