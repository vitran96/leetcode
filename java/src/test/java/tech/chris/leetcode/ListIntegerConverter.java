package tech.chris.leetcode;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.util.LinkedList;
import java.util.List;

public final class ListIntegerConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert (Object source, Class<?> targetType) throws ArgumentConversionException {
        if (source instanceof String && List.class.isAssignableFrom(targetType)) {
            List<Integer> list = new LinkedList<>();
            if (((String) source).length() == 0) {
                return list;
            }

            String[] strs = ((String) source).split(",");
            for (String str : strs) {
                list.add(Integer.parseInt(str));
            }

            return list;
        } else {
            throw new IllegalArgumentException(
                "Conversion from " + source.getClass() + " to " + targetType + " not supported.");
        }
    }

}
