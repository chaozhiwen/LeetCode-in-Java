class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
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
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		
		ListNode a=new ListNode(0);
		ListNode b=new ListNode(1);
		ListNode c=new ListNode(2);
		ListNode d=new ListNode(3);
		ListNode e=new ListNode(4);
		ListNode f=new ListNode(5);
		a.next=b;b.next=c;c.next=d;d.next=e;e.next=f;
		a=s.removeElements(a,3);
		System.out.println("0->1->2->3->4->5->null,delete 3:");
		while(a!=null){
			System.out.print(a.val+"->");
			a=a.next;
		}
		System.out.print("null"+"\n");
		System.out.println();
		
		
		ListNode t=new ListNode(1);
		t=s.removeElements(t,1);
		System.out.println("1->null,delete 1:");
		while(t!=null){
			System.out.print(t.val+"->");
			t=t.next;
		}
		System.out.print("null"+"\n");
		System.out.println();
		
		
		ListNode k=new ListNode(2);
		ListNode k1=new ListNode(2);
		k.next=k1;
		System.out.println("2->2->null,delete 2:");
		k=s.removeElements(k,2);
		while(k!=null){
			System.out.print(k.val+"->");
			k=k.next;
		}
		System.out.print("null"+"\n");
		System.out.println();
		
		
		ListNode f1=new ListNode(5);
		ListNode f2=new ListNode(6);
		ListNode f3=new ListNode(5);
		ListNode f4=new ListNode(7);
		ListNode f5=new ListNode(5);
		ListNode f6=new ListNode(8);
		ListNode f7=new ListNode(5);
		ListNode f8=new ListNode(9);
		ListNode f9=new ListNode(5);
		ListNode f10=new ListNode(10);
		ListNode f11=new ListNode(5);
		f1.next=f2;f2.next=f3;f3.next=f4;f4.next=f5;f5.next=f6;f6.next=f7;f7.next=f8;f8.next=f9;f9.next=f10;f10.next=f11;
		f1=s.removeElements(f1,5);
		System.out.println("5->6->5->7->5->8->5->9->5->10->5->null,delete 5:");
		while(f1!=null){
			System.out.print(f1.val+"->");
			f1=f1.next;
		}
		System.out.print("null"+"\n");
		System.out.println();
		
		
		
		ListNode j=null;
		j=s.removeElements(j,0);
		System.out.println("null,delete 0:");
		while(j!=null){
			System.out.print(j.val+"->");
			j=j.next;
		}
		System.out.print("null"+"\n");
		System.out.println();
	}
}
