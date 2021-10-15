/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next=head;
        
        int count=0;
        ListNode h1=dummyHead;
        System.out.println("h1 now at"+dummyHead.val);
            
        
        while(h1!=null && count<n)
        {
            h1=h1.next;
            System.out.println("h1 now at"+h1.val);
            count++;
            System.out.println("count increased to "+count);
        }
        
        ListNode h2=dummyHead;
        while(h1.next!=null)
        {
            h1=h1.next;
            h2=h2.next;
        }
        h2.next=h2.next.next;
        
        return dummyHead.next;
        
        
    }
}
