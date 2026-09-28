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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        func(root,result);
        return result;
        
    }
    void func(TreeNode node,List<Integer> result){
        
        if(node==null){
            return;
        }
        func(node.left,result);
        result.add(node.val);
        func(node.right,result);
        return;
    }
}