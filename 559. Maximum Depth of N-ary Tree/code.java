import java.util.*;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}
	
	public Node(int _val){val=_val;}
	
    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}


class Solution {
    public int maxDepth(Node root) {
        if(root==null) return 0;
        
        int ans=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int count=q.size();
            while(count>0){
                Node node=q.poll();
                for(int i=0;i<node.children.size();i++)
                    q.add(node.children.get(i));
                count--;
            }
            ans++;
        }
        return ans;
    }
}

class Main{
	public static void main(String[] args){
		/*在创建结点时，需从叶子结点开始，逐层向上*/
		
		Solution s=new Solution();
		
		/*           1              */
		/*        /  |  \           */
		/*       2   3   4          */
		/*      /|\  |   /\         */
		/*     5 6 7 8  9 10        */
		Node t5=new Node(5,new ArrayList<Node>());
		Node t6=new Node(6,new ArrayList<Node>());
		Node t7=new Node(7,new ArrayList<Node>());
		Node t8=new Node(8,new ArrayList<Node>());
		Node t9=new Node(9,new ArrayList<Node>());
		Node t10=new Node(10,new ArrayList<Node>());
		List<Node> l4=new ArrayList<>();
		l4.add(t9);
		l4.add(t10);
		Node t4=new Node(4,l4);
		List<Node> l3=new ArrayList<>();
		l3.add(t8);
		Node t3=new Node(3,l3);
		List<Node> l2=new ArrayList<>();
		l2.add(t5);
		l2.add(t6);
		l2.add(t7);
		Node t2=new Node(2,l2);
		List<Node> l1=new ArrayList<>();
		l1.add(t2);
		l1.add(t3);
		l1.add(t4);
		Node t1=new Node(1,l1);
		System.out.println(s.maxDepth(t1));
		
		
		/*       1              */
		/*      / \             */
		/*     2   3            */
		/*   / | \  \           */
		/*  4  5  6  7          */
		Node r4=new Node(4,new ArrayList<Node>());
		Node r5=new Node(5,new ArrayList<Node>());
		Node r6=new Node(6,new ArrayList<Node>());
		Node r7=new Node(7,new ArrayList<Node>());
		
		List<Node> z1=new ArrayList<>();
		z1.add(r4);
		z1.add(r5);
		z1.add(r6);
		List<Node> z2=new ArrayList<>();
		z2.add(r7);
		Node r2=new Node(2,z1);
		Node r3=new Node(3,z2);
		List<Node> z3=new ArrayList<>();
		z3.add(r2);
		z3.add(r3);
		Node r1=new Node(1,z3);
		System.out.println(s.maxDepth(r1));
		
		
		/*          1              */
		/*      / / | \ \          */
		/*     2 3  4  5 6         */
		Node n2=new Node(2,new ArrayList<Node>());
		Node n3=new Node(3,new ArrayList<Node>());
		Node n4=new Node(4,new ArrayList<Node>());
		Node n5=new Node(5,new ArrayList<Node>());
		Node n6=new Node(6,new ArrayList<Node>());
		List<Node> c=new ArrayList<Node>();
		c.add(n2);
		c.add(n3);
		c.add(n4);
		c.add(n5);
		c.add(n6);
		Node n1=new Node(1,c);
		System.out.println(s.maxDepth(n1));
		
	}
}
