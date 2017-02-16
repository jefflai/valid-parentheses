package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Parentheses {

    public static boolean isValid(String input) {
        if (input == null || input.length() == 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        char[] chars = input.toCharArray();

        Map<Character, Character> openToClose = new HashMap<>();
        openToClose.put("[".charAt(0), "]".charAt(0));
        openToClose.put("{".charAt(0), "}".charAt(0));
        openToClose.put("(".charAt(0), ")".charAt(0));

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == "[".charAt(0) || chars[i] == "(".charAt(0) || chars[i] == "{".charAt(0)) {
                stack.push(chars[i]);
            } else if (!stack.empty() && chars[i] == openToClose.get(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }

        if (stack.empty()) {
            return true;
        } else {
            return false;
        }

    }

}
