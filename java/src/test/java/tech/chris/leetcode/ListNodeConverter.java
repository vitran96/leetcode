package tech.chris.leetcode;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public final class ListNodeConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert (Object source, Class<?> targetType) throws ArgumentConversionException {
        if (source instanceof String && ListNode.class.isAssignableFrom(targetType)) {
            if (((String) source).length() == 0) {
                return null;
            }

            String[] strs = ((String) source).split(",");
            ListNode top = new ListNode(Integer.parseInt(strs[0]));
            ListNode current = top;
            for (int i = 1; i < strs.length; i++) {
                ListNode next = new ListNode(Integer.parseInt(strs[i]));
                current.next = next;
                current = next;
            }

            return top;
        } else {
            throw new IllegalArgumentException(
                "Conversion from " + source.getClass() + " to " + targetType + " not supported.");
        }
    }

}
