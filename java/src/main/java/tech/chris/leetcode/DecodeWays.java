package tech.chris.leetcode;

// 1 <= s.length <= 100
// s contains only digits and may contain leading zero(s).
public class DecodeWays {
    // TODO: redo this at some point
    // I don't really get how this work
    public int numDecodings (String s) {
        return s.length() == 0 ? 0 : numDecodings(s, 0);
    }

    private int numDecodings (String s, int n) {
        if (s.length() == n) {
            return 1;
        }

        if (s.charAt(0) == '0') {
            return 0;
        }

        int res = numDecodings(s, n + 1);

        if (n < s.length() - 1) {
            if (s.charAt(n) == '1' || (s.charAt(n) == '2' && s.charAt(n + 1) < '7')) {
                res += numDecodings(s, n + 2);
            } else if (s.charAt(n) > '2' && s.charAt(n + 1) == '0') {
                res = 0;
            }
        }

        return res;
    }
}
