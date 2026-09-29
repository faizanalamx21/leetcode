class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return mirror(root.left,root.right);
        
        
    }
    //same tree wala hi approach lagayenge ki agar left subtree aur right subtree barabar h bas ek chota s diffrence h ki left subtree k left child right subtree k right child k barabar hpona chahiye
    boolean mirror(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;

        }
        return mirror(p.left,q.right)&&mirror(p.right,q.left);
    }

    

    
}
