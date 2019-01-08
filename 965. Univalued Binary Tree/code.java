class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        if(root.left!=null&&root.left.val!=root.val)
            return false;
        if(root.right!=null&&root.right.val!=root.val)
            return false;        
        return isUnivalTree(root.left)&&isUnivalTree(root.right);
        
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		/*         100             */
		/*        /   \            */
		/*       100  100          */
		/*      / \   /  \          */
		/*   100 100 100 100        */
		TreeNode t1=new TreeNode(100);
		TreeNode t2=new TreeNode(100);
		TreeNode t3=new TreeNode(100);
		TreeNode t4=new TreeNode(100);
		TreeNode t5=new TreeNode(100);
		TreeNode t6=new TreeNode(100);
		TreeNode t7=new TreeNode(100);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		System.out.println(s.isUnivalTree(t1));
		
		
		/*       5              */
		/*      / \             */
		/*     5   2            */
		/*    / \   \           */
		/*   5   5   5        */
		TreeNode g1=new TreeNode(5);
		TreeNode g2=new TreeNode(5);
		TreeNode g3=new TreeNode(2);
		TreeNode g4=new TreeNode(5);
		TreeNode g5=new TreeNode(5);
		TreeNode g6=new TreeNode(5);
		g1.left=g2;
		g1.right=g3;
		g2.left=g4;
		g2.right=g5;
		g3.right=g6;
		System.out.println(s.isUnivalTree(g1));
		
		
		/*       1              */
		/*      / \             */
		/*     1   1            */
		/*    /     \           */
		/*   1       2          */
		TreeNode q1=new TreeNode(1);
		TreeNode q2=new TreeNode(1);
		TreeNode q3=new TreeNode(1);
		TreeNode q4=new TreeNode(1);
		TreeNode q5=new TreeNode(2);
		q1.left=q2;
		q1.right=q3;
		q2.left=q4;
		q3.right=q5;
		System.out.println(s.isUnivalTree(q1));
		
		
		/*       1              */
		/*      /               */
		/*     2                */
		/*    /                 */
		/*   1                  */
		TreeNode w1=new TreeNode(1);
		TreeNode w2=new TreeNode(2);
		TreeNode w3=new TreeNode(1);
		w1.left=w2;
		w2.left=w3;
		System.out.println(s.isUnivalTree(w1));
		
		
		/*       1              */
		/*      / \              */
		/*     1   1             */
		/*    /                 */
		/*   4                  */
		TreeNode a1=new TreeNode(1);
		TreeNode a2=new TreeNode(1);
		TreeNode a3=new TreeNode(1);
		TreeNode a4=new TreeNode(4);
		a1.left=a2;
		a1.right=a3;
		a2.left=a4;
		System.out.println(s.isUnivalTree(a1));
		
		
		/*       1              */
		TreeNode b1=new TreeNode(1);
		TreeNode b2=new TreeNode(1);
		System.out.println(s.isUnivalTree(b1));
		
		
		/*       1              */
		/*      /               */
		/*     1                */
		b1.left=b2;
		System.out.println(s.isUnivalTree(b1));
	}
}
