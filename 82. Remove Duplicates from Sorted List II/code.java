class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
	
	
	
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode h=head;
        ListNode pre=dummy;
        
        
        while(h!=null){
            ListNode tmp=h.next;
            boolean flag=true;
            while(tmp!=null&&tmp.val==h.val){
                flag=false;
                tmp=tmp.next;
            }
            if(flag){
                pre.next=h;
                pre=pre.next;
            }else
                pre.next=null;
            h=tmp;
        }
        return dummy.next;
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
		
		ListNode node1=s.arrayToList(new int[]{1,2,2,3,3,4,4,4,4,4,5});
		s.traversal(node1);
		node1=s.deleteDuplicates(node1);
		s.traversal(node1);
		System.out.println("**********");
		
		ListNode node2=s.arrayToList(new int[]{1,2});
		s.traversal(node2);
		node1=s.deleteDuplicates(node2);
		s.traversal(node2);
		System.out.println("**********");
		
		ListNode node3=s.arrayToList(new int[]{1,1});
		s.traversal(node3);
		node3=s.deleteDuplicates(node3);
		s.traversal(node3);
		System.out.println("**********");
		
		ListNode node4=s.arrayToList(new int[]{1,1,1,2,2,2,3,4,5,6,6,6,8});
		s.traversal(node4);
		node4=s.deleteDuplicates(node4);
		s.traversal(node4);
		System.out.println("**********");
	}
}
