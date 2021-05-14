package com.mrtrying;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_4 {

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {1,4};
        Solution solution = new Solution();
        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }

    /**
     * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
     */
    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            if (nums1.length == 0 || nums2.length == 0) {
                if (nums1.length == 1) {
                    return nums1[0];
                }
                if (nums2.length == 1) {
                    return nums2[0];
                }
            }
            int length = nums1.length + nums2.length;
            List<Integer> list = new ArrayList<>(length);
            int pos1 = 0, pos2 = 0;
            for (int n = 0; n < length; n++) {
                if (nums1.length <= pos1 && nums2.length > pos2) {
                    for (int i = pos2; i < nums2.length; i++) {
                        list.add(nums2[i]);
                    }
                    break;
                }
                if (nums2.length <= pos2 && nums1.length > pos1) {
                    for (int i = pos1; i < nums1.length; i++) {
                        list.add(nums1[i]);
                    }
                    break;
                }
                int num1 = nums1[pos1];
                int num2 = nums2[pos2];
                if (num1 == num2) {
                    list.add(num1);
                    list.add(num2);
                    pos1++;
                    pos2++;
                    n++;
                } else if (num1 < num2) {
                    list.add(num1);
                    pos1++;
                } else {
                    list.add(num2);
                    pos2++;
                }
            }
            int pos = length % 2 == 0 ? length / 2 - 1 : length / 2;
            if (length % 2 == 1) {
                return list.get(pos);
            } else {
                return (list.get(pos) + list.get(pos + 1)) / 2F;
            }
        }
    }

}