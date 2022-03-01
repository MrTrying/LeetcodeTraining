package com.mrtrying.qeasy.arr;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        Solution solution = new Solution();
        boolean result = solution.containsDuplicate(nums);
        System.out.println(result);
    }

    /**
     * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
     */

    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if(set.add(nums[i])){
                   continue;
                }
                return true;
            }
            return false;
        }
    }
}
