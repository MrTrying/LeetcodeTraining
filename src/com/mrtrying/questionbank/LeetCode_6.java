package com.mrtrying.questionbank;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_6 {
    public static void main(String[] args) {
        String s = "ABCD";
        int numRows = 2;
        Solution solution = new Solution();
        String result = solution.convert(s, numRows);
        System.out.println(result);
    }

    /**
     * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行Z 字形排列。
     * 比如输入字符串为 "PAYPALISHIRING"行数为 3 时，排列如下：
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
     *
     * 请你实现这个将字符串进行指定行数变换的函数：
     * string convert(string s, int numRows);
     *
     * 示例 1：
     * 输入：s = "PAYPALISHIRING", numRows = 3
     * 输出："PAHNAPLSIIGYIR"
     *
     * 示例 2：
     * 输入：s = "PAYPALISHIRING", numRows = 4
     * 输出："PINALSIGYAHRPI"
     * 解释：
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     *
     */

    static class Solution {
        public String convert(String s, int numRows) {
            if(s.length() <= numRows || numRows == 1){
                return s;
            }
            int[] pos = new int[numRows * 2 - 2];
            for (int i = 0; i < pos.length; i++) {
                pos[i] = i < numRows ? i : (numRows - 1) * 2 - i;
            }
            List<List<String>> list = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                list.add(new ArrayList<>());
            }

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                List<String> target = list.get(pos[i % pos.length]);
                target.add(String.valueOf(ch));
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < list.size(); i++) {
                List<String> target = list.get(i);
                for (int j = 0; j < target.size(); j++) {
                    sb.append(target.get(j));
                }
            }
            return sb.toString();
        }
    }
}
