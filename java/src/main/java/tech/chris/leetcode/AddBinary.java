package tech.chris.leetcode;

public class AddBinary {
    public String addBinary (String a, String b) {
        StringBuilder result = new StringBuilder();
        char[] aChars = a.toCharArray();
        int aI = aChars.length - 1;
        char[] bChars = b.toCharArray();
        int bI = bChars.length - 1;

        boolean hasRemain = false;
        while (aI >= 0 || bI >= 0) {
            int sum = 0;
            if (aI >= 0) {
                sum += aChars[aI];
                aI--;
            }

            if (bI >= 0) {
                sum += bChars[bI];
                bI--;
            }

            sum %= 48;

            if (hasRemain) {
                sum++;
            }

            if (sum > 1) {
                if (sum == 3) {
                    sum = 1;
                } else {
                    sum = 0;
                }
                hasRemain = true;
            } else {
                hasRemain = false;
            }

            result.insert(0, sum);
        }

        if (hasRemain) {
            result.insert(0, 1);
        }

        return result.toString();
    }
}
