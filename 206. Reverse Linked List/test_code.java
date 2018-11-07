class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

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
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		ListNode l5=new ListNode(5);
		ListNode l6=new ListNode(6);
		ListNode l7=new ListNode(7);
		ListNode l8=new ListNode(8);
		ListNode l9=new ListNode(9);
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;l5.next=l6;l6.next=l7;l7.next=l8;l8.next=l9;
		ListNode temp=s.reverseList(l1);
		System.out.println("1->2->3->4->5->6->7->8->9->null:");
		while(temp!=null){
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println("null");
		
	}
}
