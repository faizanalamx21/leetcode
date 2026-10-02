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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        //agar left child hi null h to leaf node to hogi nahi to bas right subtree k height+1 return kara denge
        if(root.left==null){
            return 1+minDepth(root.right);
        }
        //agar right child hi null h to leaf node to hogi nahi to bas left subtree k height+1 return kara denge
        if(root.right==null){
            return 1+minDepth(root.left);
        }
        else{
            return 1+Math.min(minDepth(root.left),minDepth(root.right));
        }
        
    }
}