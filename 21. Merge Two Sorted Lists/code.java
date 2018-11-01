/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(0);
        ListNode t=temp;
        
        //both of two nodes are not null
        while(l1!=null&&l2!=null){
            if(l1.val>=l2.val){
                temp.next=l2;
                l2=l2.next;
            }else if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
            }
            temp=temp.next;
        }//the end,one of them becomes null pointer,the other remains some elements
        
       if(l1!=null){
           temp.next=l1;
       }else{
           temp.next=l2;
       }
        return t.next;
    }
}
