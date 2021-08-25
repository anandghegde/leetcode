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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        
        if(root==null)
            return output;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        boolean isLeftToRight=true;
        q.offer(root);
        isLeftToRight=false;
        
        int cl = 1;
        while(!q.isEmpty())
        {
            List<Integer> currentLevelNodes = new ArrayList<Integer>();
            cl = q.size();
            for(int i=0;i<cl;i++)
            {
                TreeNode r1 = q.poll();
                
                if(!isLeftToRight)
                    currentLevelNodes.add(r1.val);
                else
                    currentLevelNodes.add(0, r1.val);
                
                if(r1.left!=null)
                    q.offer(r1.left);
                    
                if(r1.right!=null)
                    q.offer(r1.right);
             
            }
            isLeftToRight = !isLeftToRight;
            output.add(currentLevelNodes);
            
        }
            
        return output;   
    }
    
}
