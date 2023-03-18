package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.naryTreeNode.Node;
import tech.chris.leetcode.naryTreePreorderTraversal.Solution1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class NaryTreePreorderTraversalTest {

    static Arguments makeArg1() {
        Node root = new Node(1, new LinkedList<Node>() {{
            add(new Node(3, new LinkedList<Node>() {{
                add(new Node(5));
                add(new Node(6));
            }}));
            add(new Node(2));
            add(new Node(4));
        }});
        List<Integer> expected = new LinkedList<Integer>() {{
            add(1);
            add(3);
            add(5);
            add(6);
            add(2);
            add(4);
        }};
        return Arguments.of(root, expected);
    }

    static Arguments makeArg2() {
        Node root = new Node(1, new LinkedList<Node>() {{
            add(new Node(2));
            add(new Node(3, new LinkedList<Node>() {{
                add(new Node(6));
                add(new Node(7, new LinkedList<Node>() {{
                    add(new Node(11, new LinkedList<Node>() {{
                        add(new Node(14));
                    }}));
                }}));
            }}));
            add(new Node(4, new LinkedList<Node>() {{
                add(new Node(8, new LinkedList<Node>() {{
                    add(new Node(12));
                }}));
            }}));
            add(new Node(5, new LinkedList<Node>() {{
                add(new Node(9, new LinkedList<Node>() {{
                    add(new Node(13));
                }}));
                add(new Node(10));
            }}));
        }});
        List<Integer> expected = new LinkedList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(6);
            add(7);
            add(11);
            add(14);
            add(4);
            add(8);
            add(12);
            add(5);
            add(9);
            add(13);
            add(10);
        }};
        return Arguments.of(root, expected);
    }

    static Stream<Arguments> provideArgument() {
        return Stream.of(
            makeArg1(),
            makeArg2()
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test(Node root, List<Integer> expected) {
        Assertions.assertEquals(expected, new Solution1().preorder(root));
    }
}
