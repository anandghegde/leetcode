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
    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricHelp(root, root);
    }
    
    private boolean isSymmetricHelp(TreeNode p1, TreeNode p2)
    {
        if(p1==null || p2==null)
            return p1==p2;
        
        return p1.val==p2.val && isSymmetricHelp(p1.left, p2.right) && isSymmetricHelp(p1.right, p2.left);
    }
}
