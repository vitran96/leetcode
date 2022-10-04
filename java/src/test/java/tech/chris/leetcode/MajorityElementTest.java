package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

public class MajorityElementTest {

    @ParameterizedTest
    @CsvSource({"'3,2,3',3", "'2,2,1,1,1,2,2',2"})
    public void test (@ConvertWith(IntArrayConverter.class) int[] input, int expected) {
        Assertions.assertEquals(expected, new MajorityElement().majorityElement(input));
    }
}
