class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

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
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		ListNode l1=new ListNode(0);
		ListNode p=l1;
		for(int i=1;i<10;i++){
			l1.next=new ListNode(i);
			l1=l1.next;
			
		}
		ListNode l2=new ListNode(2);
		ListNode q=l2;
		for(int i=4;i<=20;i+=2){
			l2.next=new ListNode(i);
			l2=l2.next;	
		}
		ListNode l=s.mergeTwoLists(p,q);
		System.out.println("****************************************");
		System.out.println("0->1->2->3->4->5->6->7->8->9");
		System.out.println("");
		System.out.println("2->4->6->8->10->12->14->16->18->20");
		System.out.println("");
		System.out.print("sort:");
		while(l!=null){
			System.out.print(l.val+" ");
			l=l.next;
		}
		System.out.println("");
		System.out.println("****************************************");
		ListNode l3=null;
		ListNode l4=new ListNode(0);
		ListNode s1=l4;
		for(int i=1;i<10;i++){
			l4.next=new ListNode(i);
			l4=l4.next;	
		}
		System.out.println("null");
		System.out.println("");
		System.out.println("0->1->2->3->4->5->6->7->8->9");
		System.out.println("");
		System.out.print("sort:");
		ListNode l5=s.mergeTwoLists(l3,s1);
		while(l5!=null){
			System.out.print(l5.val+" ");
			l5=l5.next;
		}
		System.out.println("");
		System.out.println("****************************************");
	}
}
