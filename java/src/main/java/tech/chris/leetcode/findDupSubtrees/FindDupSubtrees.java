package tech.chris.leetcode.findDupSubtrees;

import tech.chris.leetcode.TreeNode;

import java.util.List;

//Given the root of a binary tree,return all duplicate subtrees.
//For each kind of duplicate subtrees,you only need to return the root node of any one of them.
//Two trees are duplicate if they have the same structure with the same node values.
//
//The number of the nodes in the tree will be in the range[1,5000]
//-200<=Node.val<=200
public interface FindDupSubtrees {
    List<TreeNode> findDuplicateSubtrees(TreeNode root);
}
