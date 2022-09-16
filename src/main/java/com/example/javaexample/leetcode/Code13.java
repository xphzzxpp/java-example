package com.example.javaexample.leetcode;

/**
 * https://leetcode.cn/problems/roman-to-integer/
 * @author mw
 * @date 2022/8/30
 */
public class Code13 {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        int toInt = solution13.romanToInt("IV");
        System.out.println(toInt);
    }

}

class Solution13 {

    public int romanToInt(String s) {
        int sum = 0;
        int pre = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if (pre < num) {
                sum -= pre;
            } else {
                sum += pre;
            }
            pre = num;
        }
        sum += pre;
        return sum;

    }

    private int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
