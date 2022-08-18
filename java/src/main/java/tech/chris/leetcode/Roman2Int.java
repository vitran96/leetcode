package tech.chris.leetcode;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Roman numerals are represented by seven different symbols:
//
//    Symbol Value
//    I 1
//    V 5
//    X 10
//    L 50
//    C 100
//    D 500
//    M 1000
//
//    For example, 2 is written as II in Roman numeral, just two ones added together.
//    12 is written as XII, which is simply X+II.
//    The number 27 is written as XXVII,which is XX+V+II.
//
//    Roman numerals are usually written largest to smallest from left to right.
//    However,the numeral for four is not IIII.
//    Instead,the number four is written as IV.
//    Because the one is before the five we subtract it making four.
//    The same principle applies to the number nine, which is written as IX.
//    There are six instances where subtraction is used:
//
//    I can be placed before V(5)and X(10)to make 4and 9.
//    X can be placed before L(50)and C(100)to make 40and 90.
//    C can be placed before D(500)and M(1000)to make 400and 900.

public class Roman2Int implements ISolution {
    private static final Map<String, Integer> ROMAN_LETTERS = new HashMap<String, Integer>() {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};

    private static final Set<String> MINUS_1 = new HashSet<String>() {{
        add("V");
        add("X");
    }};

    private static final Set<String> MINUS_10 = new HashSet<String>() {{
        add("L");
        add("C");
    }};

    private static final Set<String> MINUS_100 = new HashSet<String>() {{
        add("M");
        add("D");
    }};

    // I will assume that there is no incorrect Roman pass in
    public static int solution(String s) {
        // TODO:
        int result = 0;
        String[] strings = s.split("");
        String lastStr = "";
        for (int i = strings.length - 1; i >= 0; i--) {
            String current = strings[i];
            if (MINUS_1.contains(lastStr) && current.equals("I")) {
                result -= ROMAN_LETTERS.get("I");
            } else if (MINUS_10.contains(lastStr) && current.equals("X")) {
                result -= ROMAN_LETTERS.get("X");
            } else if (MINUS_100.contains(lastStr) && current.equals("C")) {
                result -= ROMAN_LETTERS.get("C");
            } else {
                result += ROMAN_LETTERS.get(current);
            }

            lastStr = current;
        }

        return result;
    }
}
