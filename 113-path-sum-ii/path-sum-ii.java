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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> diary=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();

        int sum=0;
        return func(root,sum,targetSum,diary,result);
        
    }
    
    List<List<Integer>> func(TreeNode node,int sum,int target,List<Integer> diary,List<List<Integer>> result){
        if(node==null){//agar root hi nulll hai to false hi hoga 
            return result;
        }
        sum=sum+node.val;
        diary.add(node.val);
        if(node.left==null&&node.right==null){
            if(sum==target){//agar rrot khud ek leaf ode h to bs uski value ko sum m add krkey compare krleneg
                result.add(new ArrayList<>(diary));
            }
        }
        //wrna dono traf compare krenge
        else{
            func(node.left,sum,target,diary,result);
            func(node.right,sum,target,diary,result);
            
        }
        diary.remove(diary.size()-1);
        return result;
    }
}