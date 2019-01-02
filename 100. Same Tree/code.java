import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        
        if(p!=null&&q!=null&&p.val==q.val)
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        return false;
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
		
		TreeNode x1=new TreeNode(1);/*       1             */
		TreeNode x2=new TreeNode(2);/*      /\             */
		TreeNode x3=new TreeNode(3);/*     2  3            */
		TreeNode x4=new TreeNode(4);/*    /\  /\           */
		TreeNode x5=new TreeNode(5);/*   4  5 6 7          */
		TreeNode x6=new TreeNode(6);
		TreeNode x7=new TreeNode(7);
		x1.left=x2;
		x2.left=x4;x2.right=x5;
		x1.right=x3;
		x3.left=x6;x3.right=x7;
		
		
		TreeNode r1=new TreeNode(1);/*       1             */
		TreeNode r2=new TreeNode(2);/*      /\             */
		TreeNode r3=new TreeNode(3);/*     2  3            */
		TreeNode r4=new TreeNode(4);/*    /    \           */
		TreeNode r5=new TreeNode(5);/*   4      5          */
		TreeNode r6=new TreeNode(6);
		r1.left=r2;r2.left=r4;
		r1.right=r3;r3.right=r5;
		
		TreeNode y1=new TreeNode(1);/*       1             */
		TreeNode y2=new TreeNode(2);/*      /\             */
		TreeNode y3=new TreeNode(3);/*     2  3            */
		TreeNode y4=new TreeNode(4);/*    /    \           */
		TreeNode y5=new TreeNode(5);/*   4      5          */
		TreeNode y6=new TreeNode(6);
		y1.left=y2;y2.left=y4;
		y1.right=y3;y3.right=y5;
		
		
		TreeNode n1=new TreeNode(1);/*       1             */
		TreeNode n2=new TreeNode(2);/*      /\             */
		TreeNode n3=new TreeNode(3);/*     2  3            */
		TreeNode n4=new TreeNode(4);/*      \  \           */
		TreeNode n5=new TreeNode(5);/*       4  5          */
		TreeNode n6=new TreeNode(6);
		n1.left=n2;n2.right=n4;
		n1.right=n3;n3.right=n5;
		
		System.out.println(s.isSameTree(t1,x1));
		System.out.println(s.isSameTree(t1,r1));
		System.out.println(s.isSameTree(t1,n1));
		System.out.println(s.isSameTree(r1,y1));
		System.out.println(s.isSameTree(r1,n1));
		 
	}
}
