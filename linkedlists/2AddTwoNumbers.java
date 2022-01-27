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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode h1 = res;
        int currentSum=0;
        int carry=0;
        int currentDigit=0;
        while(l1!=null || l2!=null)
        {
            int x = (l1==null)?0:l1.val;
            int y= (l2==null)?0:l2.val;
            
            currentSum = x+y + carry;
            if(currentSum>=10)
            {
                carry=1;
            }
            else
            {
                carry=0;
            }
            currentDigit = currentSum %10;
            ListNode n1 = new ListNode(currentDigit);
            res.next= n1;
            res=res.next;
            
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry==1)
        {
            res.next = new ListNode(1);
        }
        
        return h1.next;
    }
}
