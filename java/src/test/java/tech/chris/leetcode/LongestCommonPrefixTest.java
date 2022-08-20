package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class LongestCommonPrefixTest {

    public final static class StringArrayConverter extends SimpleArgumentConverter {
        @Override
        protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
            if (source instanceof String && String[].class.isAssignableFrom(targetType)) {
                return ((String) source).split(",");
            } else {
                throw new IllegalArgumentException("Conversion from " + source.getClass() + " to "
                    + targetType + " not supported.");
            }
        }

    }

    @ParameterizedTest
    @CsvSource({"'flower,flow,flight',fl","'dog,racecar,car',''"})
    public void test(@ConvertWith(StringArrayConverter.class) String[] input, String expected) {
        Assertions.assertEquals(expected, LongestCommonPrefix.solution(input));
    }
}
