import java.util.*;
class ListNode {
     int val;
     ListNode next;
   	 ListNode(int x) { val = x; }
 }
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
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		ListNode l5=new ListNode(5);
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;
		System.out.println(s.isPalindrome(l1));
		ListNode t1=new ListNode(1);
		ListNode t2=new ListNode(2);
		ListNode t3=new ListNode(3);
		ListNode t4=new ListNode(2);
		ListNode t5=new ListNode(1);
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;
		System.out.println(s.isPalindrome(t1));
	}
}
