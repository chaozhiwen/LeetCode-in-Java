import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        TreeNode cur=root;
        TreeNode pre=null;
        
        while(true){
            while(cur!=null){
                s.push(cur); 
                cur=cur.left;
            }
            if(s.empty())
                break;
            cur=s.pop();
            if(pre!=null&&pre.val>=cur.val)
                return false;
            pre=cur;
            cur=cur.right;
        }
        
        return true;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		/*          5              */
		/*        /   \            */
		/*       2     7           */
		/*      / \   / \          */
		/*     1   3 6   8         */
		TreeNode t1=new TreeNode(5);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(7);
		TreeNode t4=new TreeNode(1);
		TreeNode t5=new TreeNode(3);
		TreeNode t6=new TreeNode(6);
		TreeNode t7=new TreeNode(8);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		System.out.println(s.isValidBST(t1));
		
		
		
		/*       1              */
		/*      / \             */
		/*     2   3            */
		/*    / \   \           */
		/*   1   5   6          */
		TreeNode g1=new TreeNode(1);
		TreeNode g2=new TreeNode(2);
		TreeNode g3=new TreeNode(3);
		TreeNode g4=new TreeNode(1);
		TreeNode g5=new TreeNode(5);
		TreeNode g6=new TreeNode(6);
		g1.left=g2;
		g1.right=g3;
		g2.left=g4;
		g2.right=g5;
		g3.right=g6;
		System.out.println(s.isValidBST(g1));
		
		
		/*       1              */
		/*      / \             */
		/*     2   4            */
		/*    /     \           */
		/*   3       5          */
		TreeNode q1=new TreeNode(1);
		TreeNode q2=new TreeNode(2);
		TreeNode q3=new TreeNode(4);
		TreeNode q4=new TreeNode(3);
		TreeNode q5=new TreeNode(5);
		q1.left=q2;
		q1.right=q3;
		q2.left=q4;
		q3.right=q5;
		System.out.println(s.isValidBST(q1));
		
		
		
		/*       1              */
		/*      /               */
		/*     2                */
		/*    /                 */
		/*   3                  */
		TreeNode w1=new TreeNode(1);
		TreeNode w2=new TreeNode(2);
		TreeNode w3=new TreeNode(3);
		w1.left=w2;
		w2.left=w3;
		System.out.println(s.isValidBST(w1));
		
		
		
		/*       1              */
		/*      / \              */
		/*     2   3             */
		/*    /                 */
		/*   4                  */
		TreeNode a1=new TreeNode(1);
		TreeNode a2=new TreeNode(2);
		TreeNode a3=new TreeNode(3);
		TreeNode a4=new TreeNode(4);
		a1.left=a2;
		a1.right=a3;
		a2.left=a4;
		System.out.println(s.isValidBST(a1));
		
		
		/*       1              */
		TreeNode b1=new TreeNode(1);
		TreeNode b2=new TreeNode(2);
		System.out.println(s.isValidBST(b1));
		
		
		/*       1              */
		/*      /               */
		/*     2                */
		b1.left=b2;
		System.out.println(s.isValidBST(b1));
	}
}
