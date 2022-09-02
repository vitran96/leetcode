package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class Merge2SortedListTest {

    @ParameterizedTest
    @CsvSource({"'1,2,4','1,3,4','1,1,2,3,4,4'", "'','0','0'"})
    public void test (@ConvertWith(ListNodeConverter.class) ListNode input1,
                      @ConvertWith(ListNodeConverter.class) ListNode input2,
                      @ConvertWith(ListNodeConverter.class) ListNode expected) {
        Assertions.assertEquals(expected, new Merge2SortedList().mergeTwoLists(input1, input2));
    }
}
