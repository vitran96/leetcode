package tech.chris.leetcode;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.util.Arrays;

public class IntArrayConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert (Object source, Class<?> targetType) throws ArgumentConversionException {
        if (source instanceof String && int[].class.isAssignableFrom(targetType)) {
            if (((String) source).isEmpty()) {
                return new int[0];
            }

            return Arrays.stream(((String) source).split(",")).mapToInt(Integer::parseInt).toArray();
        } else {
            throw new IllegalArgumentException("Conversion from " + source.getClass() + " to "
                                               + targetType + " not supported.");
        }
    }
}
