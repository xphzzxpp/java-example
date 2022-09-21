package com.example.javaexample.leetcode;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.cn/problems/valid-parentheses/
 * @author mw
 * @date 2022/8/24
 */
public class Code20 {
    public boolean valid(String s){
        Map<Character,Character> maps = new HashMap<>();
        maps.put(')','(');
        maps.put('}','{');
        maps.put(']','[');

        Stack<Character> stacks = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(maps.containsKey(chars[i])){
                Character c = stacks.isEmpty() ? '#' : stacks.pop();
                if(!c.equals(maps.get(chars[i]))){
                    return false;
                }
            }else{
                stacks.push(chars[i]);
            }
        }
        return stacks.isEmpty();
    }

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
        Code20 code20 = new Code20();
        boolean valid = code20.valid("{[]]}");
        System.out.println(valid);
    }
}
