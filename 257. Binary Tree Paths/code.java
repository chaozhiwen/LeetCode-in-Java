import java.util.*;

class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        res(root,"",ans);
        return ans;
    }
    public static void res(TreeNode root,String s,List<String> ans){
        if(root==null) return;
        s+=root.val+"";
        
        if(root.left==null&&root.right==null)
            ans.add(s);

        res(root.left,s+"->",ans);
        res(root.right,s+"->",ans);
        
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
		List<String> print1=s.binaryTreePaths(t1);
		for(int i=0;i<print1.size();i++)
			System.out.println(print1.get(i)+" ");
		System.out.println("**********");

		
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
		List<String> print2=s.binaryTreePaths(g1);
		for(int i=0;i<print2.size();i++)
			System.out.println(print2.get(i)+" ");
		System.out.println("**********");
		
		
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
		List<String> print3=s.binaryTreePaths(q1);
		for(int i=0;i<print3.size();i++)
			System.out.println(print3.get(i)+" ");
		System.out.println("**********");
		
		
		/*       3              */
		/*      / \              */
		/*     1   5            */
		TreeNode w1=new TreeNode(3);
		TreeNode w2=new TreeNode(1);
		TreeNode w3=new TreeNode(5);
		w1.left=w2;
		w1.right=w3;
		List<String> print4=s.binaryTreePaths(w1);
		for(int i=0;i<print4.size();i++)
			System.out.println(print4.get(i)+" ");
		System.out.println("**********");
		
		
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
		List<String> print5=s.binaryTreePaths(a1);
		for(int i=0;i<print5.size();i++)
			System.out.println(print5.get(i)+" ");
		System.out.println("**********");	
		
		
		
		/*       2              */
		/*      /               */
		/*     1                */
		TreeNode b1=new TreeNode(2);
		TreeNode b2=new TreeNode(1);
		b1.left=b2;	
		List<String> print6=s.binaryTreePaths(b1);
		for(int i=0;i<print6.size();i++)
			System.out.println(print6.get(i)+" ");
		System.out.println("**********");
		
		
		/*                100                       */
		/*              /     \                     */
		/*          50           120                */
		/*       /      \      /      \             */
		/*      45      60    110     130           */
		/*     /  \    / \   / \     /   \          */
		/*    40  46  55 65 105 120 130   140       */
		/*      \   \  \  \   \   \   \     \       */
		/*      42  48 57 81  110 125 135  145      */
		/*      /   /  /  /   /   /   /    /        */
		/*     41  47 56 80 109 124 132   142       */
		TreeNode t8=new TreeNode(40);
		TreeNode t9=new TreeNode(46);
		TreeNode t10=new TreeNode(55);
		TreeNode t11=new TreeNode(65);
		TreeNode t12=new TreeNode(105);
		TreeNode t13=new TreeNode(120);
		TreeNode t14=new TreeNode(130);
		TreeNode t15=new TreeNode(140);
		t4.left=t8;t4.right=t9;t5.left=t10;t5.right=t11;t6.left=t12;t6.right=t13;t7.left=t14;t7.right=t15;
		TreeNode t16=new TreeNode(42);
		TreeNode t17=new TreeNode(48);
		TreeNode t18=new TreeNode(57);
		TreeNode t19=new TreeNode(81);
		TreeNode t20=new TreeNode(110);
		TreeNode t21=new TreeNode(125);
		TreeNode t22=new TreeNode(135);
		TreeNode t23=new TreeNode(145);
		t8.right=t16;t9.right=t17;t10.right=t18;t11.right=t19;t12.right=t20;t13.right=t21;t14.right=t22;t15.right=t23;
		TreeNode f1=t1;
		TreeNode t24=new TreeNode(41);
		TreeNode t25=new TreeNode(47);
		TreeNode t26=new TreeNode(56);
		TreeNode t27=new TreeNode(80);
		TreeNode t28=new TreeNode(109);
		TreeNode t29=new TreeNode(124);
		TreeNode t30=new TreeNode(132);
		TreeNode t31=new TreeNode(142);
		t16.left=t24;t17.left=t25;t18.left=t26;t19.left=t27;t20.left=t28;t21.left=t29;t22.left=t30;t23.left=t31;	
		List<String> print7=s.binaryTreePaths(t1);
		for(int i=0;i<print7.size();i++)
			System.out.println(print7.get(i)+" ");
		System.out.println("**********");
	}
}
