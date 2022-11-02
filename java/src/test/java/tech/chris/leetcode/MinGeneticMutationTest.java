package tech.chris.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tech.chris.leetcode.minGeneticMutation.MySolution;

import java.util.stream.Stream;

public class MinGeneticMutationTest {

    static Stream<Arguments> provideArgument () {
        return Stream.of(Arguments.of("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"}, 1),
                         Arguments.of("AACCGGTT",
                                      "AAACGGTA",
                                      new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"},
                                      2
                         ),
                         Arguments.of("AAAAACCC",
                                      "AACCCCCC",
                                      new String[]{"AAAACCCC", "AAACCCCC", "AACCCCCC"},
                                      3
                         )
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgument")
    public void test1 (String start, String end, String[] bank, int expected) {
        Assertions.assertEquals(expected, new MySolution().minMutation(start, end, bank));
    }
}
