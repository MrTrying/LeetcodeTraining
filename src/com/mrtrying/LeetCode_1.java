package com.mrtrying;

import java.util.ArrayList;

public class LeetCode_1 {

    public static void main(String[] args) {
        // write your code here
        Solution demo = new Solution();
//        int[] arr = demo.twoSum(new int[]{2,7,11,15},9);
//        int[] arr = demo.twoSum(new int[]{3,2,4},6);
        int[] arr = demo.twoSum(new int[]{0,3,4,0},0);
        ArrayList list = new ArrayList();
        for (int i:arr) {
            list.add(i);
        }
        System.out.println(list);
    }

    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     * 你可以按任意顺序返回答案。
     *
     * 示例 1：
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     *
     * 示例 2：
     * 输入：nums = [3,2,4], target = 6
     * 输出：[1,2]
     *
     * 示例 3：
     * 输入：nums = [3,3], target = 6
     * 输出：[0,1]
     * */

    static class Solution{
        /**
         * @param nums
         * @param target
         * @return
         */
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if(nums[i] + nums[j] == target){
                        return new int[]{i,j};
                    }
                }
            }
            return new int[0];
        }

    }

}
