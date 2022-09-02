package tech.chris.leetcode;

//You are climbing a staircase.It takes n steps to reach the top.
//
//Each time you can either climb 1or 2steps.In how many distinct ways can you climb to the top?
//
// 1 <= n <= 45
public class ClimbingStairs {
    public int climbStairs (int n) {
        if (n <= 2) {
            return n;
        }

        return climbStairs(n - 2) + climbStairs(n - 1);
    }
}
