class ListNode {
    int val;
	ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode h=new ListNode(0);
        h.next=head;
        ListNode left=h;
        ListNode mid=head;
        ListNode right=head.next;
        while(mid!=null&&mid.next!=null){
            left.next=right;
            mid.next=right.next;
            right.next=mid;
            
            left=mid;
            mid=mid.next;
            if(mid==null)
                return h.next;
            right=mid.next;
        }
        return h.next;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		ListNode h1=null;
		h1=s.swapPairs(h1);
		while(h1!=null){
			System.out.print(h1.val+" ");
			h1=h1.next;
		}
		System.out.println();
		
		
		ListNode h2=new ListNode(-1);
		h2=s.swapPairs(h2);
		while(h2!=null){
			System.out.print(h2.val+" ");
			h2=h2.next;
		}
		System.out.println();
		
		
		ListNode h3=new ListNode(0);
		ListNode h4=new ListNode(1);
		h3.next=h4;
		h3=s.swapPairs(h3);
		while(h3!=null){
			System.out.print(h3.val+" ");
			h3=h3.next;
		}
		System.out.println();
		
		
		
		ListNode h5=new ListNode(2);
		ListNode h6=new ListNode(3);
		ListNode h7=new ListNode(4);
		h5.next=h6;h6.next=h7;
		h5=s.swapPairs(h5);
		while(h5!=null){
			System.out.print(h5.val+" ");
			h5=h5.next;
		}
		System.out.println();
		
		
		
		ListNode h8=new ListNode(5);
		ListNode h9=new ListNode(6);
		ListNode h10=new ListNode(7);
		ListNode h11=new ListNode(8);
		ListNode h12=new ListNode(9);
		ListNode h13=new ListNode(10);
		ListNode h14=new ListNode(11);
		h8.next=h9;h9.next=h10;h10.next=h11;h11.next=h12;h12.next=h13;h13.next=h14;
		h8=s.swapPairs(h8);
		while(h8!=null){
			System.out.print(h8.val+" ");
			h8=h8.next;
		}
		System.out.println();
		
		
		
		
	}
}
