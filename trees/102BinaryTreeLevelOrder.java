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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        if(root==null) return output;
        q.offer(root);
        
        Integer nodesInCurrentLevel = 1;
        while(!q.isEmpty())
        {
            nodesInCurrentLevel = q.size();
            List<Integer> currentLevelList = new LinkedList<Integer>();
            for(int i=0;i<nodesInCurrentLevel ;i++)
            {
                TreeNode r1 = q.poll();
                
            
                currentLevelList.add(r1.val);
                if(r1.left!=null)
                {
                    q.offer(r1.left);
                }
                if(r1.right!=null)
                {
                    q.offer(r1.right);
                }
            }
            output.add(currentLevelList);
            
            
        }
        return output;
    }
}
