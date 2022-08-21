package tech.chris.leetcode;

import java.util.Stack;

//Given a string s containing just the characters'(',')','{','}','['and']',determine if the input string is valid.
//
//    An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
public class ValidParentheses implements ISolution {
    private static String getExpectedBracket(String s) {
        switch (s) {
            case "{":
                return "}";
            case "[":
                return "]";
            case "(":
                return ")";
            default:
                return "";
        }
    }

    private static boolean isCloseBracket(String s) {
        switch (s) {
            case "}":
            case "]":
            case ")":
                return true;
            default:
                return false;
        }
    }

    public boolean isValid(String s) {
        Stack<String> parentheses = new Stack<>();
        String[] strings = s.split("");
        for (String str : strings) {
            String expectedBracket = getExpectedBracket(str);
            if (expectedBracket.equals("")) {
                if (parentheses.empty()) {
                    return false;
                }

                String lastBracket = parentheses.pop();
                if (!lastBracket.equals(str)) {
                    return false;
                }
            } else if (isCloseBracket(expectedBracket)) {
                parentheses.push(expectedBracket);
            }
        }

        return parentheses.empty();
    }
}
