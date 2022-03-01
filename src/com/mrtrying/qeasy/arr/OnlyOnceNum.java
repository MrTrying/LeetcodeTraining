package com.mrtrying.qeasy.arr;

import java.util.HashSet;

public class OnlyOnceNum {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        Solution solution = new Solution();
        int result = solution.singleNumber(nums);
        System.out.println(result);
    }

    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     *
     * 说明：
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     */
    static class Solution {
        public int singleNumber(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (!set.add(num)) {
                    set.remove(num);
                }
            }
            return set.iterator().next();
        }
    }

    static class Solution2 {
        public int singleNumber(int[] nums) {
            int result = 0;
            for (int i = 0; i < nums.length; i++) {
                result ^= nums[i];
            }
            return result;
        }
    }


}
