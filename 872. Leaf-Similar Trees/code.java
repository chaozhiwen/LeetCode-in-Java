import java.util.*;

class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return leaf(root1).equals(leaf(root2));
    }
    
    public static List<Integer> leaf(TreeNode node){
        List<Integer> ans=new ArrayList<>();
        if(node==null) return ans;
        
        Stack<TreeNode> s=new Stack<>();
        
        while(true){
            while(node!=null){
                s.push(node);
                node=node.left;
            }
            if(s.empty())
                break;
            node=s.pop();
            if(node.left==null&&node.right==null)
                ans.add(node.val);
            node=node.right;
        }
        
        
        return ans;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		/*         100          */
		/*        /   \         */
		/*       50    20       */
		/*      / \   /  \      */
		/*     60  3 6   99     */
		TreeNode t1=new TreeNode(100);
		TreeNode t2=new TreeNode(50);
		TreeNode t3=new TreeNode(20);
		TreeNode t4=new TreeNode(60);
		TreeNode t5=new TreeNode(3);
		TreeNode t6=new TreeNode(6);
		TreeNode t7=new TreeNode(99);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;				
		/*      100              */
		/*      / \             */
		/*    50   20            */
		/*   /  \    \           */
		/*  60   3   99        */
		TreeNode g1=new TreeNode(100);
		TreeNode g2=new TreeNode(50);
		TreeNode g3=new TreeNode(20);
		TreeNode g4=new TreeNode(60);
		TreeNode g5=new TreeNode(3);
		TreeNode g6=new TreeNode(99);
		g1.left=g2;
		g1.right=g3;
		g2.left=g4;
		g2.right=g5;
		g3.right=g6;
		System.out.println(s.leafSimilar(t1,g1));
		
		
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
		/*       1              */
		/*      / \              */
		/*     3   5            */
		TreeNode w1=new TreeNode(1);
		TreeNode w2=new TreeNode(3);
		TreeNode w3=new TreeNode(5);
		w1.left=w2;
		w1.right=w3;
		System.out.println(s.leafSimilar(q1,w1));
		
		
		/*       1              */
		/*      / \              */
		/*     2   3             */
		/*          \           */
		/*           4          */
		TreeNode a1=new TreeNode(1);
		TreeNode a2=new TreeNode(2);
		TreeNode a3=new TreeNode(3);
		TreeNode a4=new TreeNode(4);
		a1.left=a2;
		a1.right=a3;
		a3.right=a4;		
		/*       1              */
		/*      /               */
		/*     2                */
		TreeNode b1=new TreeNode(1);
		TreeNode b2=new TreeNode(2);
		b1.left=b2;
		System.out.println(s.leafSimilar(a1,b1));
		
		
		/*               100                 */
		/*            /       \              */
		/*          50         20            */
		/*        /   \      /    \          */
		/*      60     3    6      99        */
		/*     /  \   / \  / \    /  \       */
		/*    70  80 50 4 60  5  9   22      */
		/*      \   \  \ \  \  \  \    \     */
		/*      42  66 7 81 32 53  95  24   <- */
		/*      /   /  / /  /  /   /   /       */
		/*     42  66 7 81 32 53  95  24    <- */
		TreeNode t8=new TreeNode(70);
		TreeNode t9=new TreeNode(80);
		TreeNode t10=new TreeNode(50);
		TreeNode t11=new TreeNode(4);
		TreeNode t12=new TreeNode(60);
		TreeNode t13=new TreeNode(5);
		TreeNode t14=new TreeNode(9);
		TreeNode t15=new TreeNode(22);
		t4.left=t8;t4.right=t9;t5.left=t10;t5.right=t11;t6.left=t12;t6.right=t13;t7.left=t14;t7.right=t15;
		TreeNode t16=new TreeNode(42);
		TreeNode t17=new TreeNode(66);
		TreeNode t18=new TreeNode(7);
		TreeNode t19=new TreeNode(81);
		TreeNode t20=new TreeNode(32);
		TreeNode t21=new TreeNode(53);
		TreeNode t22=new TreeNode(95);
		TreeNode t23=new TreeNode(24);
		t8.right=t16;t9.right=t17;t10.right=t18;t11.right=t19;t12.right=t20;t13.right=t21;t14.right=t22;t15.right=t23;
		TreeNode f1=t1;
		TreeNode t24=new TreeNode(42);
		TreeNode t25=new TreeNode(66);
		TreeNode t26=new TreeNode(7);
		TreeNode t27=new TreeNode(81);
		TreeNode t28=new TreeNode(32);
		TreeNode t29=new TreeNode(53);
		TreeNode t30=new TreeNode(95);
		TreeNode t31=new TreeNode(24);
		t16.left=t24;t17.left=t25;t18.left=t26;t19.left=t27;t20.left=t28;t21.left=t29;t22.left=t30;t23.left=t31;
		System.out.println(s.leafSimilar(t1,f1));
	}
}
