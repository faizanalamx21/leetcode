/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        //assume krenge ki recuresion hamey left aur right subtree ki height bata dega fr dono subtree ku height k maximum lenge aur usmey 1 add kr denge kyuki root s nikalna h
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
