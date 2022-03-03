package com.mrtrying.qeasy.str;

public class FirstUniqChar {
    public static void main(String[] args) {
        String s = "aabb";
        Solution solution = new Solution();
        int result = solution.firstUniqChar(s);
        System.out.println(result);
    }

    /**
     * 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
     * <p>
     * 示例 1：
     * 输入: s = "leetcode"
     * 输出: 0
     * <p>
     * 示例 2:
     * 输入: s = "loveleetcode"
     * 输出: 2
     * <p>
     * 示例 3:
     * 输入: s = "aabb"
     * 输出: -1
     */

    static class Solution {
        public int firstUniqChar(String s) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (s.indexOf(c) == s.lastIndexOf(c)) {
                    return i;
                }
            }
            return -1;
        }
    }
}
