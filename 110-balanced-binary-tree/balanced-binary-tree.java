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
    public boolean isBalanced(TreeNode root) {
        height(root);
        return ans;
        
    }
    boolean ans=true;
    int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);
        //agar ek baar bhi height difference 1 se bada hua to false hojyega
        if(Math.abs(left-right)>1){
            ans=false;
        }
        return 1+Math.max(left,right);
    }
        
    
    
}
        