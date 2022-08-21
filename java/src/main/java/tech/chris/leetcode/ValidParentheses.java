package tech.chris.leetcode;

import java.util.Stack;

//Given a string s containing just the characters'(',')','{','}','['and']',determine if the input string is valid.
//
//    An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
public class ValidParentheses implements ISolution {
    private static String getExpectedString(String str) {
        switch (str) {
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

    public static boolean solution(String input) {
        Stack<String> parentheses = new Stack<>();
        String[] strings = input.split("");
        for (String str : strings) {
            String expectedBracket = getExpectedString(str);
            if (expectedBracket.equals("")) {
                String lastBracket = parentheses.pop();
                if (!lastBracket.equals(str)) {
                    return false;
                }
            } else {
                parentheses.push(expectedBracket);
            }
        }

        return parentheses.empty();
    }
}
