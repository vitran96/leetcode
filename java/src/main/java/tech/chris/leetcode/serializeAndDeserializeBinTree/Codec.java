package tech.chris.leetcode.serializeAndDeserializeBinTree;

import tech.chris.leetcode.TreeNode;

public interface Codec {
    // Encodes a tree to a single string.
    String serialize(TreeNode root);

    // Decodes your encoded data to tree.
    TreeNode deserialize(String data);
}
