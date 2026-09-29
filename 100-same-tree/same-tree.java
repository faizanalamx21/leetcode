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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;

        }
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val){//agar root hi barabar nahi h to direct false
            return false;
        }
        //fr dono tree k recursively left aur right node check krenge
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);

    }   
        
}
