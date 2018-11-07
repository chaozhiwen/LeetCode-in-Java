/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode h=head;
        Stack<ListNode> s=new Stack<>();
        while(h!=null){
            s.push(h);
            h=h.next;
        }
        while(!s.empty()){
            if(s.pop().val!=head.val){
                return false;
            }else{
                head=head.next;
            }
        }
        return true;
        
    }
}
