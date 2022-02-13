/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)
            return null;
        
        HashMap<Node, Node> visited = new HashMap<Node, Node>();
        visited.put(node, new Node(node.val, new ArrayList<>()));
        
        Queue<Node> myQ = new LinkedList<>();
        myQ.add(node);
        
        while(!myQ.isEmpty())
        {
            Node current = myQ.remove();
            for(Node n: current.neighbors)
            {
                if(!visited.containsKey(n))
                {
                    visited.put(n, new Node(n.val, new ArrayList<>()));
                    myQ.add(n); 
                    
                }
                visited.get(current).neighbors.add(visited.get(n));
            }
            
        }
        return visited.get(node);
    }
}
