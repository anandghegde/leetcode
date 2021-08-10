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
    public TreeNode sortedArrayToBST(int[] nums) {
        return arrayToBST(nums, 0, nums.length-1);
    }
    
    private TreeNode arrayToBST(int[] nums, int low, int high)
    {
        if(low>high)
            return null;
        int mid = low+(high-low)/2;
        TreeNode n1 = new TreeNode(nums[mid]);
        n1.left = arrayToBST(nums, low, mid-1);
        n1.right = arrayToBST(nums, mid+1, high);
        return n1;
    }
}
