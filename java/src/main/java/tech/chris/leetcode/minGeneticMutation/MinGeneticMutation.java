package tech.chris.leetcode.minGeneticMutation;

/**
 * A gene string can be represented by an 8-character long string, with choices from 'A', 'C', 'G',
 * and 'T'.
 * <p>
 * Suppose we need to investigate a mutation from a gene string start to a gene string end where one
 * mutation is defined as one single character changed in the gene string.
 * <p>
 * For example, "AACCGGTT" --> "AACCGGTA" is one mutation.
 * <p>
 * There is also a gene bank bank that records all the valid gene mutations. A gene must be in bank
 * to make it a valid gene string.
 * <p>
 * Given the two gene strings start and end and the gene bank bank, return the minimum number of
 * mutations needed to mutate from start to end. If there is no such a mutation, return -1.
 * <p>
 * Note that the starting point is assumed to be valid, so it might not be included in the bank.
 * <p>
 * Constraints:
 * start.length == 8
 * end.length == 8
 * 0 <= bank.length <= 10
 * bank[i].length == 8
 * start, end, and bank[i] consist of only the characters ['A', 'C', 'G', 'T'].
 */
public interface MinGeneticMutation {
    int minMutation (String start, String end, String[] bank);
}
