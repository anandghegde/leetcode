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
    public int getDecimalValue(ListNode head) {
        int length=0;
        ListNode dupe = head;
        while(dupe!=null)
        {
            dupe=dupe.next;
            length++;
        }
        System.out.println("length is "+length);
        int convertedNum = 0;
        
        while(head!=null)
        {
            System.out.println("in loop: length="+length+ " and head.val="+head.val);
            int add1 = (int)(Math.pow(2, (length-1)))*head.val;
            System.out.println("add1 is "+add1);
            convertedNum = convertedNum +add1;
            head=head.next;
            length--;
        }
        return convertedNum;
    }
}
