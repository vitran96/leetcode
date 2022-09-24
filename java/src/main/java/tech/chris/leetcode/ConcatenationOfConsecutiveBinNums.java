package tech.chris.leetcode;

// Given an integer n, return the decimal value of the binary string formed by concatenating the binary
// representations of 1 to n in order, modulo 10^9 + 7.
// 1 <= n <= 10^5
public class ConcatenationOfConsecutiveBinNums {
    private static final int MODULO = 1_000_000_007;

    // Binary number manipulation is REQUIRED to pass this!
    public int concatenatedBinary (int n) {
        long result = 0;
        int binaryDigits = 0; // tracking how many digit the current number have
        for (int i = 1; i <= n; i++) {
            // Check if binary digit of i increase
            // Start of 0
            // i = 1 (1) -> 1 binary digit => increase binaryDigits
            // i = 2 (10) -> 2 binary digits => increase binaryDigits
            // i = 3 (11) -> 2 binary digits => no op
            // i = 4 (100) -> 3 binary digits => increase binaryDigits
            // So how does the check happen??
            // This is done by doing AND operator between the current and the last number
            // Eg:
            // 1 (1) AND 0 () = 0 => digit increased
            // 2 (10) AND 1 (1) = 00 => digit increased
            // 3 (11) AND 2 (10) = 10 => digit remain
            // 4 (100) and 3 (11) = 000 => digit increased
            if ((i & (i - 1)) == 0) {
                binaryDigits++;
            }

            // result then shift to the left by binaryDigits to give space for adding i
            // the OR operator is used to add i
            result = ((result << binaryDigits) | i) % MODULO;
        }

        return ((int) result);
    }
}
