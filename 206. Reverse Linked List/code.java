/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode h=head;
        ListNode ans=null;
        while(h!=null){
            ListNode p=h;
            h=h.next;
            p.next=ans;
            ans=p;
        }
        return ans;
    }
}
