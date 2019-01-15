import java.util.*;

class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        int smallest=root.val;
        int second=Integer.MAX_VALUE;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode tmp=q.poll();
            if(tmp.val<second&&tmp.val>smallest)
                second=tmp.val;
            if(tmp.left!=null)
                q.add(tmp.left);
            if(tmp.right!=null)
                q.add(tmp.right);
        }
        return second==Integer.MAX_VALUE?-1:second;
    }   
}



class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		/*              50           */
		/*            /    \         */
		/*           50    60        */
		/*          /  \   / \       */
		/*         55  50 70 60      */
		/*        /  \               */
		/*       55  55              */
		TreeNode t1=new TreeNode(50);
		TreeNode t2=new TreeNode(50);
		TreeNode t3=new TreeNode(60);
		TreeNode t4=new TreeNode(55);
		TreeNode t5=new TreeNode(50);
		TreeNode t6=new TreeNode(70);
		TreeNode t7=new TreeNode(60);
		TreeNode t8=new TreeNode(55);
		TreeNode t9=new TreeNode(55);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		t4.left=t8;
		t8.right=t9;
		System.out.println(s.findSecondMinimumValue(t1));
		System.out.println(s.findSecondMinimumValue(t2));
		System.out.println(s.findSecondMinimumValue(t3));
		System.out.println(s.findSecondMinimumValue(t4));
		System.out.println(s.findSecondMinimumValue(t7));
	}
}
