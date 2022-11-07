package tech.chris.leetcode.max69Num;

public class MySolution1 implements Max69Num {
    @Override
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        return Integer.parseInt(s.replaceFirst("6", "9"));
    }
}
