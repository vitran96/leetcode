package tech.chris.leetcode.findDupSubtrees;

import tech.chris.leetcode.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution1 implements FindDupSubtrees {
    @Override
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Boolean> hashmap = new HashMap<>();
        List<TreeNode> results = new LinkedList<>();
        serializeTreeNode(root.left, results, hashmap);
        serializeTreeNode(root.right, results, hashmap);
        return results;
    }

    // Serialize tree node to unique ID for Map
    private String serializeTreeNode(TreeNode node,
                                     List<TreeNode> result,
                                     Map<String, Boolean> hashmap) {
        if (node == null) {
            return "";
        }

        String left = serializeTreeNode(node.left, result, hashmap);
        String right = serializeTreeNode(node.right, result, hashmap);
        String id = node.val + "#" + left + "#" + right;
        if (!hashmap.containsKey(id)) {
            hashmap.put(id, false);
        } else if (!hashmap.get(id)) {
            result.add(node);
            hashmap.replace(id, true);
        }

        return id;
    }
}
