import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        List<ListNode> nodeList=new ArrayList<>();
        
        while(l1!=null){
            stack1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            stack2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        while(!stack1.empty()||!stack2.empty()){
            int sum=0;
            if(!stack1.empty())
                sum+=stack1.pop();
            if(!stack2.empty())
                sum+=stack2.pop();
            nodeList.add(new ListNode((sum+carry)%10));
            carry=(sum+carry)/10;
        }
        if(carry!=0)
            nodeList.add(new ListNode(carry));
		for(int i=nodeList.size()-1;i>0;i--)
			nodeList.get(i).next=nodeList.get(i-1);
		return nodeList.get(nodeList.size()-1);    
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
		
		ListNode n1=new ListNode(7);
		ListNode n2=new ListNode(8);
		ListNode n3=new ListNode(9);
		ListNode n4=new ListNode(1);
		ListNode n5=new ListNode(2);
		ListNode n6=new ListNode(3);
		n1.next=n2;n2.next=n3;
		n4.next=n5;n5.next=n6;
		ListNode print1=s.addTwoNumbers(n1,n4);
		s.traversal(print1);
		
		ListNode print2=s.addTwoNumbers(n6,n3);
		s.traversal(print2);
		
		ListNode print3=s.addTwoNumbers(n6,n6);
		s.traversal(print3);
		
		ListNode print4=s.addTwoNumbers(n1,null);
		s.traversal(print4);
	}
}
