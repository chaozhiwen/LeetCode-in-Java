class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0) return head;
        ListNode pre=head;
        ListNode res;
        int len=1;
        while(pre.next!=null){
            len++;
            pre=pre.next;
        }
        k%=len;
        pre.next=head;
        for(int i=0;i<len-k;i++)
            pre=pre.next;
        res=pre.next;
        pre.next=null;
        return res;
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
		node1=s.rotateRight(node1,3);
		s.traversal(node1);
		System.out.println("**********");
		
		ListNode node2=s.arrayToList(new int[]{1,2});
		s.traversal(node2);
		node2=s.rotateRight(node2,3);
		s.traversal(node2);
		System.out.println("**********");
		
		ListNode node3=s.arrayToList(new int[]{1,2,1});
		s.traversal(node3);
		node3=s.rotateRight(node3,2);
		s.traversal(node3);
		System.out.println("**********");
		
		ListNode node4=s.arrayToList(new int[]{1,1,1,2,2,2,3,4,5,6,6,6,8});
		s.traversal(node4);
		node4=s.rotateRight(node4,13);
		s.traversal(node4);
		System.out.println("**********");
	}
}
