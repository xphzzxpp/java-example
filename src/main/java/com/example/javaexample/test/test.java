package com.example.javaexample.test;

/**
 * 字符串转数字
 * @author mw
 * @date 2022/9/8
 */
public class test {
    public static void main(String[] args) {
        String str = "123657647";
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            sum = sum*10 + getNum(charArray[i]);
        }
        System.out.println(sum);
    }

    private static int getNum(char c) {
        switch (c){
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                throw  new NumberFormatException("包含非数字");
        }
    }
}
