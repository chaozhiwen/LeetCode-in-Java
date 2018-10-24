class ListNode {
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
 }

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
class Main{
	public static void main(String[] args){
		ListNode list=new ListNode(0);
		ListNode l=list;
		for(int i=1;i<=10;i++){
			list.next=new ListNode(i);
			list=list.next;
		}
		Solution s=new Solution();
		System.out.println("[0,1,2,3,4,5,6,7,8,9,10]:"+s.middleNode(l).val);

		ListNode li=new ListNode(0);
		l=li;
		for(int i=1;i<9;i++){
			li.next=new ListNode(i);
			li=li.next;
		}
		System.out.println("[0,1,2,3,4,5,6,7,8,9]:"+s.middleNode(l).val);

		ListNode lis=new ListNode(0);
		l=lis;
		for(int i=1;i<9;i++){
			lis.next=new ListNode((int)(Math.random()*100));
			lis=lis.next;
		}
		System.out.println("10 random numbers:"+s.middleNode(l).val);
	}
}
