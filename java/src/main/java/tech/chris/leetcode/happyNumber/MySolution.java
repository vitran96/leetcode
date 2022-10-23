package tech.chris.leetcode.happyNumber;

import java.util.HashSet;
import java.util.Set;

public class MySolution implements HappyNumber {
    @Override
    public boolean isHappy (int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int toDivideTo = 10;
            int newN = 0;
            while (n > 0) {
                newN += Math.pow(n % toDivideTo, 2);
                n /= toDivideTo;
            }

            n = newN;
        }

        return n == 1;
    }
}
