package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import tech.chris.leetcode.removeLinkedListElements.MySolution;

public class RemoveLinkedListElementsTest {

    @ParameterizedTest
    @CsvSource({"'1,2,6,3,4,5,6',6,'1,2,3,4,5'", "'',1,''", "'7,7,7,7',7,''"})
    public void test (@ConvertWith(ListNodeConverter.class) ListNode head, int val,
                      @ConvertWith(ListNodeConverter.class) ListNode expected) {
        Assertions.assertEquals(expected, new MySolution().removeElements(head, val));
    }
}
