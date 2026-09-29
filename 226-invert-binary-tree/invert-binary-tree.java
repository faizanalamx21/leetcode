class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        //phley root k left aur right child ko swap krenge 
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //fr left subtreee aur rightsubtree ko call krenge
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
