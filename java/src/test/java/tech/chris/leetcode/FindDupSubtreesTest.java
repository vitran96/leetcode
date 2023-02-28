package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.findDupSubtrees.Solution1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FindDupSubtreesTest {

    static Stream<Arguments> provideArgument() {
        Arguments arg1 = Arguments.of(new TreeNode(1,
                                                   new TreeNode(2, new TreeNode(4), null),
                                                   new TreeNode(3,
                                                                new TreeNode(2, new TreeNode(4), null),
                                                                new TreeNode(4))),
                                      new ArrayList<TreeNode>() {{
                                          add(new TreeNode(2, new TreeNode(4), null));
                                          add(new TreeNode(4));
                                      }});

        Arguments arg2 = Arguments.of(new TreeNode(2, new TreeNode(1), new TreeNode(1)),
                                      new ArrayList<TreeNode>() {{
                                          add(new TreeNode(1));
                                      }});

        Arguments arg3 = Arguments.of(new TreeNode(2,
                                                   new TreeNode(2, new TreeNode(3), null),
                                                   new TreeNode(2, new TreeNode(3), null)),
                                      new ArrayList<TreeNode>() {{
                                          add(new TreeNode(2, new TreeNode(3), null));
                                          add(new TreeNode(3));
                                      }});
        return Stream.of(arg1, arg2, arg3);
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(TreeNode root, List<TreeNode> expected) {
        Assertions.assertEquals(expected, new Solution1().findDuplicateSubtrees(root));
    }
}
