package tech.chris.leetcode.max69Num;

/**
 * TODO: This can be optimized by using math to find the 1st '6'
 * Then use math to replace the '6'
 */
public class MySolution1 implements Max69Num {
    @Override
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        return Integer.parseInt(s.replaceFirst("6", "9"));
    }
}
