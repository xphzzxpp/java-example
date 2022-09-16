package com.example.javaexample.leetcode;

/**
 * @author mw
 * @date 2022/8/30
 */
public class Code9 {
    public static void main(String[] args) {
        /**
         * 判断回文数
         * 123  321
         * 121  121
         * 121%10 1*10+2=12
         * 12%10 2
         * 1%10  1  12*10=120+1=121
         */
        boolean palindrome = new Solution9().isPalindrome(121);
        System.out.println(palindrome);
    }
}

class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int cur = 0;
        int num = x;
        while (num != 0) {
            cur = cur * 10 + num % 10;
            num = num / 10;
        }
        return cur == x;
    }
}
