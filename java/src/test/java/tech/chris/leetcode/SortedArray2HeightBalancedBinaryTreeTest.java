package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.sortedArray2HeightBalancedBinaryTree.Solution1;

import java.util.stream.Stream;

public class SortedArray2HeightBalancedBinaryTreeTest {

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            Arguments.of(new ListNodeConverter().convert("-10,-3,0,5,9", ListNode.class),
                         new TreeNodeConverter().convert("0,-3,9,-10,null,5", TreeNode.class)),
            Arguments.of(null, null),
            Arguments.of(new ListNodeConverter().convert("-15,-10,-3,-1,0,5,9", ListNode.class),
                         new TreeNodeConverter().convert("-1,-10,5,-15,-3,0,9", TreeNode.class)),
            Arguments.of(new ListNodeConverter().convert("-15,-10,-7,-3,-1,0,5,9", ListNode.class),
                         new TreeNodeConverter().convert("-1,-7,5,-10,-3,0,9,-15", TreeNode.class))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(ListNode head, TreeNode expected) {
        Assertions.assertEquals(expected, new Solution1().sortedListToBST(head));
    }
}
