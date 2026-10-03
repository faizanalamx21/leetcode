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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer>set=new HashSet<>();
        if(root==null){
            return false;
        }
        return search(root,k,set);
        
    }
    boolean search(TreeNode node,int target,HashSet<Integer> set){
        if(node==null){
            return false;
        }
        int first=node.val;
        int second=target-first;
        //hashset m second value khojenge 
        if(set.contains(second)){
            return true;
        }
        //har baar first value daaltey jaynge
        set.add(first);
        //last me dono subtree m khojenge

        return search(node.left,target,set)||search(node.right,target,set);
    }
}