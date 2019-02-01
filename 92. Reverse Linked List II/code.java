class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null||head.next==null||m==n) return head;
        
        ListNode res=new ListNode(0);
        res.next=head;
        ListNode pre=res;
        ListNode tail;
        ListNode last;
        ListNode first=null;
        
        for(int i=0;i<m-1;i++)
            pre=pre.next;
        tail=pre.next;
        last=tail;
        
        for(int i=0;i<=n-m;i++){
            ListNode node=tail;
            tail=tail.next;
            node.next=first;
            first=node;
        }
        pre.next=first;
        last.next=tail;
        
        return res.next;
    }
	
	public ListNode arrayToList(int[] nums){
		ListNode node=new ListNode(nums[0]);
		ListNode res=node;
		for(int i=1;i<nums.length;i++){
			node.next=new ListNode(nums[i]);
			node=node.next;
		}
		return res;
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
		
		ListNode node1=s.arrayToList(new int[]{1,2,3,4,5,6,7,8,9});
		s.traversal(node1);
		node1=s.reverseBetween(node1,1,9);
		s.traversal(node1);
		System.out.println("**********");
		
		ListNode node2=s.arrayToList(new int[]{1,2,3,4,5,6,7,8,9});
		s.traversal(node2);
		node2=s.reverseBetween(node2,3,7);
		s.traversal(node2);
		System.out.println("**********");
		
		ListNode node3=s.arrayToList(new int[]{1,2});
		s.traversal(node3);
		node3=s.reverseBetween(node3,1,2);
		s.traversal(node3);
		System.out.println("**********");
		
		ListNode node4=s.arrayToList(new int[]{1,2,3});
		s.traversal(node4);
		node4=s.reverseBetween(node4,1,2);
		s.traversal(node4);
		System.out.println("**********");
	}
}
