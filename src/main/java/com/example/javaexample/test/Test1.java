package com.example.javaexample.test;

/**
 * @author mw
 * @date 2022/9/8
 */
public class Test1 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{3,4,5},{4,5,6,7}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
            System.out.println("----------------------");
        }
    }
}
