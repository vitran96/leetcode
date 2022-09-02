package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class DeleteDuplicatesTest {

    @ParameterizedTest
    @CsvSource({"'1,1,2','1,2'", "'1,1,2,3,3','1,2,3'"})
    public void test (@ConvertWith(ListNodeConverter.class) ListNode input,
                      @ConvertWith(ListNodeConverter.class) ListNode expected) {
        Assertions.assertEquals(expected, new DeleteDuplicates().deleteDuplicates(input));
    }
}
