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
        List<Integer> op = new ArrayList<Integer>();
        if(root!=null)
            op = inorder(root, op);
        return op;
    }
    
    private List<Integer> inorder(TreeNode r1, List<Integer> output)
    {
        if(r1.left!=null)
            output = inorder(r1.left, output);
        
        output.add(r1.val);
        
        if(r1.right!=null)
            output = inorder(r1.right, output);
        
        return output;
    }
}
