package com.example.javaexample.leetcode;


import java.util.HashMap;
import java.util.Stack;

/**
 * @author mw
 * @date 2022/8/24
 */
public class Test1 {
    public boolean isValid(String s) {
        // 括号之间的对应规则
        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (mappings.containsKey(chars[i])) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(chars[i])) {
                    return false;
                }
            } else {
                stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        Test1 test1 = new Test1();
        boolean valid = test1.isValid("{[]}}");
        System.out.println(valid);
        String s = "123456";
        Stack<Character> stackArray = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stackArray.push(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            Character pop = stackArray.pop();
            System.out.println(pop);
        }
    }
}
