import java.util.*;

class TreeNode {
    public int val;
    public List<TreeNode> children;

    public TreeNode(int _val,List<TreeNode> _children) {
        val = _val;
        children = _children;
    }
}

/* 改变原题目，无返回值，按前序遍历输出 */
class Solution {
    public void preorder(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        TreeNode n=root;
        
        while(n!=null){
            System.out.print(n.val+" ");
            for(int i=n.children.size()-1;i>=0;i--)
                   s.push(n.children.get(i));
            
            if(s.empty())
                break;
            
            n=s.pop();
        }
    }
}

class Main{
	public static void main(String[] args){
		/*在创建结点时，需从叶子结点开始，逐层向上*/
		
		Solution s=new Solution();
		
		/*       	   1              */
		/*    		/  |  \           */
		/*   	       2   3   4          */
		/*  	      /|\  |   /\         */
		/*           5 6 7 8  9 10        */
		TreeNode t5=new TreeNode(5,new ArrayList<TreeNode>());
		TreeNode t6=new TreeNode(6,new ArrayList<TreeNode>());
		TreeNode t7=new TreeNode(7,new ArrayList<TreeNode>());
		TreeNode t8=new TreeNode(8,new ArrayList<TreeNode>());
		TreeNode t9=new TreeNode(9,new ArrayList<TreeNode>());
		TreeNode t10=new TreeNode(10,new ArrayList<TreeNode>());
		List<TreeNode> l4=new ArrayList<>();
		l4.add(t9);
		l4.add(t10);
		TreeNode t4=new TreeNode(4,l4);
		List<TreeNode> l3=new ArrayList<>();
		l3.add(t8);
		TreeNode t3=new TreeNode(3,l3);
		List<TreeNode> l2=new ArrayList<>();
		l2.add(t5);
		l2.add(t6);
		l2.add(t7);
		TreeNode t2=new TreeNode(2,l2);
		List<TreeNode> l1=new ArrayList<>();
		l1.add(t2);
		l1.add(t3);
		l1.add(t4);
		TreeNode t1=new TreeNode(1,l1);
		s.preorder(t1);
		System.out.println();
		
		
		/*       1              */
		/*      / \             */
		/*     2   3            */
		/*   / | \  \           */
		/*  4  5  6  7          */
		TreeNode r4=new TreeNode(4,new ArrayList<TreeNode>());
		TreeNode r5=new TreeNode(5,new ArrayList<TreeNode>());
		TreeNode r6=new TreeNode(6,new ArrayList<TreeNode>());
		TreeNode r7=new TreeNode(7,new ArrayList<TreeNode>());
		
		List<TreeNode> z1=new ArrayList<>();
		z1.add(r4);
		z1.add(r5);
		z1.add(r6);
		List<TreeNode> z2=new ArrayList<>();
		z2.add(r7);
		TreeNode r2=new TreeNode(2,z1);
		TreeNode r3=new TreeNode(3,z2);
		List<TreeNode> z3=new ArrayList<>();
		z3.add(r2);
		z3.add(r3);
		TreeNode r1=new TreeNode(1,z3);
		s.preorder(r1);
		System.out.println();
		
		
		/*          1              */
		/*      / / | \ \          */
		/*     2 3  4  5 6         */
		TreeNode n2=new TreeNode(2,new ArrayList<TreeNode>());
		TreeNode n3=new TreeNode(3,new ArrayList<TreeNode>());
		TreeNode n4=new TreeNode(4,new ArrayList<TreeNode>());
		TreeNode n5=new TreeNode(5,new ArrayList<TreeNode>());
		TreeNode n6=new TreeNode(6,new ArrayList<TreeNode>());
		List<TreeNode> c=new ArrayList<TreeNode>();
		c.add(n2);
		c.add(n3);
		c.add(n4);
		c.add(n5);
		c.add(n6);
		TreeNode n1=new TreeNode(1,c);
		s.preorder(n1);
		
	}
}
