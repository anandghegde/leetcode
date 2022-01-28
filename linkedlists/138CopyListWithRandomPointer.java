/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    HashMap<Node, Node> visited = new HashMap<Node, Node>();
    
    private Node getClonedNode(Node n1)
    {
        if(n1!=null)
        {
            if(!visited.containsKey(n1))
            {
                this.visited.put(n1, new Node(n1.val));
            }
            
            return this.visited.get(n1);
        }
        
        return null;
    }
        
    
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        
        Node savedHead = head;
        
        Node newHead = new Node(head.val);
        this.visited.put(head, newHead);
        
        while(head!=null)
        {
            newHead.random = this.getClonedNode(head.random);
            newHead.next=this.getClonedNode(head.next);
            
            head=head.next;
            newHead=newHead.next;   
        }
        
        return this.visited.get(savedHead);
    }
}
