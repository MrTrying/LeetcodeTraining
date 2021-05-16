package com.mrtrying;

public class LeetCode_421 {
    public static void main(String[] args) {
        int[] nums = {3,10,5,25,2,8};
        Solution solution = new Solution();
        System.out.println(solution.findMaximumXOR(nums));
    }

    static class Solution {
        public int findMaximumXOR(int[] nums) {
            int result = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    int temp = nums[i] ^ nums[j];
                    if(temp > result){
                        result = temp;
                    }
                }
            }
            return result;
        }
    }

    static class Solution2 {

    }
}
