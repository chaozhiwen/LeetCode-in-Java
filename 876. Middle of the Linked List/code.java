/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode h1=head;
        int count=0;//record element count
        while(h1!=null){
            count++;
            h1=h1.next;
        }
        h1=head;
        for(int i=1;i<=count/2;i++){
            h1=h1.next;
        }
            return h1;     
    }
}
