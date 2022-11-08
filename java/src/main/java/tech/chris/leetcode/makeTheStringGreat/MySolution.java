package tech.chris.leetcode.makeTheStringGreat;

public class MySolution implements MakeTheStringGreat {
    @Override
    public String makeGood (String s) {
        StringBuilder sb = new StringBuilder(s);
        while (true) {
            boolean isGood = true;
            for (int i = 0; i < sb.length() - 1; i++) {
                char c1 = sb.charAt(i);
                char c2 = sb.charAt(i + 1);
                if (c1 != c2 && (
                    Character.toLowerCase(c1) == c2 || c1 == Character.toLowerCase(c2)
                )) {
                    isGood = false;
                    sb.replace(i, i + 2, "");
                }
            }

            if (isGood) {
                break;
            }
        }
        return sb.toString();
    }
}
