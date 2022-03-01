package com.mrtrying;

public class Utils {

    public static void printArr(int[] nums){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            if(i < nums.length-1){
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }

}
