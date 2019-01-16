class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root!=null){
            if(p.val<root.val&&q.val<root.val)
                root=root.left;
            else if(root.val<p.val&&root.val<q.val)
                root=root.right;
            else 
                break;
        }
        return root;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
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
		
		System.out.println(s.lowestCommonAncestor(t1,t24,t25).val);
		System.out.println(s.lowestCommonAncestor(t1,t4,t5).val);
		System.out.println(s.lowestCommonAncestor(t1,t6,t7).val);
		System.out.println(s.lowestCommonAncestor(t1,t30,t31).val);
		System.out.println(s.lowestCommonAncestor(t1,t24,t25).val);
		System.out.println(s.lowestCommonAncestor(t1,t5,t6).val);
		System.out.println(s.lowestCommonAncestor(t1,t24,t31).val);
		System.out.println(s.lowestCommonAncestor(t1,t24,t25).val);
		
	}
}
