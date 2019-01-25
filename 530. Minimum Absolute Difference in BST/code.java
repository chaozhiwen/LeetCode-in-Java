import java.util.*;

class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class Solution {
    public int getMinimumDifference(TreeNode root) {
        if(root==null) return 0;
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        while(true){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            if(stack.empty())
                break;
            root=stack.pop();
            list.add(root.val);
            root=root.right;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++)
            ans=Math.min(list.get(i+1)-list.get(i),ans);
        return ans;
    }
}


class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		/*         100           */
		/*        /   \          */
		/*       50    120       */
		/*      / \   /  \       */
		/*     45 60 110 130     */
		TreeNode t1=new TreeNode(100);
		TreeNode t2=new TreeNode(50);
		TreeNode t3=new TreeNode(120);
		TreeNode t4=new TreeNode(45);
		TreeNode t5=new TreeNode(60);
		TreeNode t6=new TreeNode(110);
		TreeNode t7=new TreeNode(130);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;	
		System.out.println(s.getMinimumDifference(t1));

		
		/*         100           */
		/*        /   \          */
		/*       50    120       */
		/*      / \     \       */
		/*     45 60    130     */
		TreeNode g1=new TreeNode(100);
		TreeNode g2=new TreeNode(50);
		TreeNode g3=new TreeNode(120);
		TreeNode g4=new TreeNode(45);
		TreeNode g5=new TreeNode(60);
		TreeNode g6=new TreeNode(130);
		g1.left=g2;
		g1.right=g3;
		g2.left=g4;
		g2.right=g5;
		g3.right=g6;	
		System.out.println(s.getMinimumDifference(g1));
		
		
		/*       3              */
		/*      / \             */
		/*     2   4            */
		/*    /     \           */
		/*   1       5          */
		TreeNode q1=new TreeNode(3);
		TreeNode q2=new TreeNode(2);
		TreeNode q3=new TreeNode(4);
		TreeNode q4=new TreeNode(1);
		TreeNode q5=new TreeNode(5);
		q1.left=q2;
		q1.right=q3;
		q2.left=q4;
		q3.right=q5;	
		System.out.println(s.getMinimumDifference(q1));
		
		
		/*       3              */
		/*      / \              */
		/*     1   5            */
		TreeNode w1=new TreeNode(3);
		TreeNode w2=new TreeNode(1);
		TreeNode w3=new TreeNode(5);
		w1.left=w2;
		w1.right=w3;	
		System.out.println(s.getMinimumDifference(w1));
		
		
		/*       1              */
		/*      / \              */
		/*     0   3             */
		/*          \           */
		/*           4          */
		TreeNode a1=new TreeNode(1);
		TreeNode a2=new TreeNode(0);
		TreeNode a3=new TreeNode(3);
		TreeNode a4=new TreeNode(4);
		a1.left=a2;
		a1.right=a3;
		a3.right=a4;	
		System.out.println(s.getMinimumDifference(a1));		
		
		
		
		/*       2              */
		/*      /               */
		/*     1                */
		TreeNode b1=new TreeNode(2);
		TreeNode b2=new TreeNode(1);
		b1.left=b2;	
		System.out.println(s.getMinimumDifference(b1));
		
	}
}
