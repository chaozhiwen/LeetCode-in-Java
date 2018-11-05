/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        while(head!=null&&head.val==val){head=head.next;}
        
        ListNode h=head;
        while(h!=null&&h.next!=null){
            if(h.next.val==val){
                h.next=h.next.next;
            }else{
                h=h.next;
            }
        }
        return head;
    }
}
