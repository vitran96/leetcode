package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.constructQuadTree.Solution1;
import tech.chris.leetcode.quadtree.Node;

import java.util.stream.Stream;

public class ConstructQuadTreeTest {

    static Stream<Arguments> provideArgument() {
        Node expected1 = new Node(true,
                                  false,
                                  new Node(false, true),
                                  new Node(true, true),
                                  new Node(true, true),
                                  new Node(false, true));

        Node expected2 = new Node(true,
                                  false,
                                  new Node(true, true),
                                  new Node(true,
                                           false,
                                           new Node(false, true),
                                           new Node(false, true),
                                           new Node(true, true),
                                           new Node(true, true)),
                                  new Node(true, true),
                                  new Node(false, true));
        return Stream.of(
            Arguments.of(new int[][]{{0, 1}, {1, 0}}, expected1),
            Arguments.of(new int[][]{
                             {1, 1, 1, 1, 0, 0, 0, 0},
                             {1, 1, 1, 1, 0, 0, 0, 0},
                             {1, 1, 1, 1, 1, 1, 1, 1},
                             {1, 1, 1, 1, 1, 1, 1, 1},
                             {1, 1, 1, 1, 0, 0, 0, 0},
                             {1, 1, 1, 1, 0, 0, 0, 0},
                             {1, 1, 1, 1, 0, 0, 0, 0},
                             {1, 1, 1, 1, 0, 0, 0, 0}},
                         expected2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(int[][] grid, Node expected) {
        Assertions.assertEquals(expected, new Solution1().construct(grid));
    }
}
