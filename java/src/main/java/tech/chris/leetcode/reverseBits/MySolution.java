package tech.chris.leetcode.reverseBits;

public class MySolution implements ReverseBits {
    // TODO: can be optimized with bitwise operation
    @Override
    public int reverseBits (int n) {
        StringBuilder sb = new StringBuilder(Integer.toUnsignedString(n, 2));
        while (sb.length() < 32) {
            sb.insert(0, '0');
        }
        sb.reverse();
        return Integer.parseUnsignedInt(sb.toString(), 2);
    }
}
