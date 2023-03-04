package tech.chris.leetcode.repeatedSubstring;

public class Solution1 implements RepeatedSubstring {
    @Override
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1) {
            return false;
        }

        int size = 1;
        String substring1 = "";
        int mid = s.length() / 2;
        for (int i = 0; i < mid; i++, size++) {
            substring1 += s.charAt(i);
            if (s.length() % size != 0) {
                continue;
            }

            String substring2 = "";
            boolean isRepeated = true;
            for (int j = i + 1; j < s.length(); j++) {
                if (substring2.length() != size) {
                    substring2 += s.charAt(j);
                }

                if (substring2.length() == size) {
                    if (!substring2.equals(substring1)) {
                        isRepeated = false;
                        break;
                    } else {
                        substring2 = "";
                    }
                }
            }

            if (isRepeated) {
                return true;
            }
        }

        return false;
    }
}
