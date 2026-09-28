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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        func(root,result);
        return result;
        
    }
    void func(TreeNode node,List<Integer> result){
        
        if(node==null){
            return;
        }
        
        result.add(node.val);//preorder=root left right
        func(node.left,result);
        func(node.right,result);
        return;
    }
}