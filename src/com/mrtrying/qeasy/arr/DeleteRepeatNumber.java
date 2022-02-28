package com.mrtrying.qeasy.arr;

public class DeleteRepeatNumber {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Solution solution = new Solution();
        int length = solution.removeDuplicates(nums);
        System.out.println(length);
    }

    /**
     * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
     * 由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么nums的前 k 个元素应该保存最终结果。
     * 将最终结果插入nums 的前 k 个位置后返回 k 。
     *
     * 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     */

    static class Solution {
        public int removeDuplicates(int[] nums) {
            //优化后
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[count] != nums[i]) {
                    nums[++count] = nums[i];
                }
            }
            return ++count;

            //优化前
//            int count = 0;
//            int currNum = 0;
//            for (int i = 0; i < nums.length; i++) {
//                if (i == 0) {
//                    currNum = nums[i];
//                    continue;
//                }
//                if (currNum != nums[i]) {
//                    nums[count + 1] = nums[i];
//                    currNum = nums[i];
//                    count++;
//                }
//            }
//            return count + 1;
        }
    }
}
