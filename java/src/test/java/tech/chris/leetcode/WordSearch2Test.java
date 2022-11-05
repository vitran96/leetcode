package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.wordSearch2.MySolution;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class WordSearch2Test {

    static Stream<Arguments> provideArgument () {
        return Stream.of(Arguments.of(new char[][]{
            {'o', 'a', 'a', 'n'},
            {'e', 't', 'a', 'e'},
            {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}
        }, new String[]{"oath", "pea", "eat", "rain"}, new ArrayList<String>() {{
            add("eat");
            add("oath");
        }}), Arguments.of(new char[][]{{'a', 'b'}, {'c', 'd'}},
                          new String[]{"abcb"},
                          new ArrayList<String>()
        ));
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (char[][] board, String[] words, List<String> expected) {
        Assertions.assertEquals(expected, new MySolution().findWords(board, words));
    }
}
