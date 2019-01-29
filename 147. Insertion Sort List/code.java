class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null) return head;
        
        ListNode sentry=new ListNode(0);
        sentry.next=head;
        ListNode pre=head;
        ListNode cur=head.next;
        
        while(cur!=null){
            ListNode h=sentry;
            while(cur.val>h.next.val)
                h=h.next;
                
            pre.next=cur.next;
            cur.next=h.next;
            h.next=cur;
            
            if(pre.val<cur.val)
                pre=pre.next;
            if(pre==null) break;
            cur=pre.next;
        }
        return sentry.next;
    }
	
	public void traversal(ListNode node){
		while(node.next!=null){
			System.out.print(node.val+"->");
			node=node.next;
		}
		System.out.println(node.val);
	}
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		
		n5.next=n4;n4.next=n3;n3.next=n2;n2.next=n1;
		s.traversal(n5);
		s.traversal(s.insertionSortList(n5));
		System.out.println("***");
		
		n3.next=n4;n4.next=n5;n5.next=n1;n1.next=n2;n2.next=null;
		s.traversal(n3);
		s.traversal(s.insertionSortList(n3));
		System.out.println("***");
		
		n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n1;n1.next=null;
		s.traversal(n2);
		s.traversal(s.insertionSortList(n2));
		System.out.println("***");
	}
}
