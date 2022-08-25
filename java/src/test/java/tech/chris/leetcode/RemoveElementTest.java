package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class RemoveElementTest {

    @ParameterizedTest
    @CsvSource({"'3,2,2,3',3,2,'2,2'", "'0,1,2,2,3,0,4,2',2,5,'0,1,4,0,3'"})
    public void test (@ConvertWith(IntArrayConverter.class) int[] input1, int input2, int expected1,
                      @ConvertWith(IntArrayConverter.class) int[] expected2) {
        Assertions.assertEquals(expected1, new RemoveElement().removeElement(input1, input2));
        Assertions.assertArrayEquals(Arrays.stream(expected2).sorted().toArray(),
                                     Arrays.stream(input1).limit(expected1).sorted().toArray());
    }
}
