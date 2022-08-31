package tech.chris.leetcode;

//Given a non-negative integer x,compute and return the square root of x.
//
//Since the return type is an integer,the decimal digits are truncated,and only the integer part of the result is returned.
//
//Note:You are not allowed to use any built-in exponent function or operator,such as pow(x,0.5)or x**0.5.
public class SqrtX implements ISolution {
    public int mySqrt (int x) {
        if (x == 0) {
            return 0;
        } else if (x <= 3) {
            return 1;
        }

        int result = 2;
        while (true) {
            final long next = result + 1;
            if (next * next > x) {
                break;
            }

            result = (int) next;
        }

        return result;
    }
}
