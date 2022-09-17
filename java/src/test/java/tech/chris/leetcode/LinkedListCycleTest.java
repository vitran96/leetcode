package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class LinkedListCycleTest {

    @ParameterizedTest
    @CsvSource({"'',", "'',"})
    public void test (@ConvertWith(ListNodeConverter.class) ListNode head, boolean expected) {
        Assertions.assertEquals(expected, new LinkedListCycle().hasCycle(head));
    }
}
