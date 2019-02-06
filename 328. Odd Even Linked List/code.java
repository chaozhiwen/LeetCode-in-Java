class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode firstEven=even;
        ListNode cur=even.next;
        boolean flag=true;//odd:true,even:false
        while(cur!=null){
            if(flag){
                odd.next=cur;
                odd=odd.next;
            }else{
                even.next=cur;
                even=even.next;
            }
            flag=!flag;
            cur=cur.next;
        }
        odd.next=firstEven;
		even.next=null;
        return head;
    }

	public ListNode arrayToList(int[] nums){
		if(nums.length==0) return null;
		ListNode node=new ListNode(nums[0]);
		ListNode res=node;
		for(int i=1;i<nums.length;i++){
			node.next=new ListNode(nums[i]);
			node=node.next;
		}
		return res;
	}
	
	public void traversal(ListNode node){
		if(node==null){
			System.out.println("null");
			return;
		}
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
		
		ListNode node1=s.arrayToList(new int[]{1,2,3,4,5,6,7});
		s.traversal(node1);
		node1=s.oddEvenList(node1);
		s.traversal(node1);
		System.out.println("**********");
		
		ListNode node2=s.arrayToList(new int[]{1,2});
		s.traversal(node2);
		node2=s.oddEvenList(node2);
		s.traversal(node2);
		System.out.println("**********");
		
		ListNode node3=s.arrayToList(new int[]{});
		s.traversal(node3);
		node3=s.oddEvenList(node3);
		s.traversal(node3);
		System.out.println("**********");
		

	}
}
