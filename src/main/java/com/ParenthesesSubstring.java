package com;

import java.util.Stack;

public class ParenthesesSubstring {

    public static int lengthOfLongestValid(String input) {
        if (input == null || input.length() == 0) {
            return 0;
        }

        char[] chars = input.toCharArray();
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == "(".charAt(0)) {
                stack.push(i);
            } else if (chars[i] == ")".charAt(0)) {
                stack.pop();
                if (!stack.empty()) {
                    result = Math.max(result, i - stack.peek());
                } else {
                    stack.push(i);
                }
            }
        }

        return result;
    }

}
