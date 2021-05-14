package com.mrtrying;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_12 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i = 100; i < 150; i++) {
            System.out.println(solution.intToRoman(i));
        }
//        System.out.println(solution.intToRoman(14));
    }

    /**
     * 罗马数字包含以下七种字符：I，V，X，L，C，D和M。
     * <p>
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * 例如， 罗马数字 2 写做II，即为两个并列的 1。12 写做XII，即为X+II。 27 写做XXVII, 即为XX+V+II。
     * <p>
     * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为IX。这个特殊的规则只适用于以下六种情况：
     * <p>
     * I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
     * X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
     * C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
     * 给你一个整数，将其转为罗马数字。
     */

    static class Solution {
        public String intToRoman(int num) {
            StringBuffer sb = new StringBuffer();
            List<Integer> numList = new ArrayList<>();
            do {
                numList.add(num % 10);
                num = num / 10;
            } while (num > 0);
            String[] romanArr = {"I", "V", "X", "L", "C", "D", "M", "", ""};
            for (int i = 0; i < numList.size(); i++) {
                int n = numList.get(i);
                //个位
                String one = romanArr[2 * i];
                String five = romanArr[2 * i + 1];
                String ten = romanArr[2 * i + 2];
                int rem = n % 5;
                //处理 5
                if (n == 5) {
                    sb.insert(0, five);
                    continue;
                }
                //处理 4 和 9
                if (rem == 4) {
                    sb.insert(0, one + (n > 5 ? ten : five));
                    continue;
                }
                //处理其他数字
                String temp = "";
                for (int j = 0; j < rem; j++) {
                    temp += one;
                }
                sb.insert(0, (n > 5 ? five : "") + temp);
            }
            return sb.toString();
        }
    }

    /**
     * 方法一
     */
    class Solution1 {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        public String intToRoman(int num) {
            StringBuffer roman = new StringBuffer();
            for (int i = 0; i < values.length; ++i) {
                int value = values[i];
                String symbol = symbols[i];
                while (num >= value) {
                    num -= value;
                    roman.append(symbol);
                }
                if (num == 0) {
                    break;
                }
            }
            return roman.toString();
        }
    }

    /**
     * 方法二：硬编码数字
     */
    class Solution2 {
        String[] thousands = {"M", "MM", "MMM"};
        String[] hundreds = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        public String intToRoman(int num) {
            StringBuffer roman = new StringBuffer();
            roman.append(thousands[num / 1000 + 1]);
            roman.append(hundreds[num % 1000 / 100 + 1]);
            roman.append(tens[num % 100 / 10 + 1]);
            roman.append(ones[num % 10 + 1]);
            return roman.toString();
        }
    }
}
