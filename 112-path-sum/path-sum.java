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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        return func(root,sum,targetSum);
        
    }
    boolean result=false;
    boolean func(TreeNode node,int sum,int target){
        if(node==null){//agar root hi nulll hai to false hi hoga 
            return false;
        }
        sum=sum+node.val;
        if(node.left==null&&node.right==null){
            if(sum==target){//agar rrot khud ek leaf ode h to bs uski value ko sum m add krkey compare krleneg
                result=true;
            }
        }
        //wrna dono traf compare krenge
        else{
            func(node.left,sum,target);
            func(node.right,sum,target);
        }
        return result;
    }
}