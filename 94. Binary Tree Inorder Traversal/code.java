import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


/* 改写原题目要求，无返回值，前序遍历直接输出 */
class Solution {
    public void inorderTraversal(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        TreeNode r=root;
        
        while(true){
            while(r!=null){
                s.push(r);
                r=r.left;
            }
            if(s.empty())
                break;
            System.out.print(s.peek().val);
            r=s.pop();
            r=r.right;               
        }
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		TreeNode t1=new TreeNode(1);/*       1             */
		TreeNode t2=new TreeNode(2);/*      /\             */
		TreeNode t3=new TreeNode(3);/*     2  3            */
		TreeNode t4=new TreeNode(4);/*    /\  /\           */
		TreeNode t5=new TreeNode(5);/*   4  5 6 7          */
		TreeNode t6=new TreeNode(6);
		TreeNode t7=new TreeNode(7);
		t1.left=t2;
		t2.left=t4;t2.right=t5;
		t1.right=t3;
		t3.left=t6;t3.right=t7;
		s.inorderTraversal(t1);
		System.out.println();
		
		TreeNode r1=new TreeNode(1);/*       1             */
		TreeNode r2=new TreeNode(2);/*      /\             */
		TreeNode r3=new TreeNode(3);/*     2  3            */
		TreeNode r4=new TreeNode(4);/*    /    \           */
		TreeNode r5=new TreeNode(5);/*   4      5          */
		TreeNode r6=new TreeNode(6);
		r1.left=r2;r2.left=r4;
		r1.right=r3;r3.right=r5;
		s.inorderTraversal(r1);
		System.out.println();
		
		TreeNode n1=new TreeNode(1);/*       1             */
		TreeNode n2=new TreeNode(2);/*      /\             */
		TreeNode n3=new TreeNode(3);/*     2  3            */
		TreeNode n4=new TreeNode(4);/*      \  \           */
		TreeNode n5=new TreeNode(5);/*       4  5          */
		TreeNode n6=new TreeNode(6);
		n1.left=n2;n2.right=n4;
		n1.right=n3;n3.right=n5;
		s.inorderTraversal(n1); 
	}
}
