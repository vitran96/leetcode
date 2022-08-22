package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.CsvSource;

public class Merge2SortedListTest {

    @ParameterizedTest
    @CsvSource({"'1,2,4','1,3,4','1,1,2,3,4,4'", "'','0','0'"})
    public void test (@ConvertWith(ListNodeConverter.class) ListNode input1,
                      @ConvertWith(ListNodeConverter.class) ListNode input2,
                      @ConvertWith(ListNodeConverter.class) ListNode expected) {
        Assertions.assertEquals(expected, new Merge2SortedList().mergeTwoLists(input1, input2));
    }

    public final static class ListNodeConverter extends SimpleArgumentConverter {
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
}
