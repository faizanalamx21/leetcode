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
    public int goodNodes(TreeNode root) {
        return countgoodnode(root,Integer.MIN_VALUE);
        
    }
    public int countgoodnode(TreeNode node,int maxlength){
        int count=0;
        if(node==null){
            return 0;
        }
        
        if(node.val>=maxlength){
            count=1;
        }
        maxlength=Math.max(maxlength,node.val);
        count+=countgoodnode(node.left,maxlength);
        count+=countgoodnode(node.right,maxlength);
        return count;

    }
}