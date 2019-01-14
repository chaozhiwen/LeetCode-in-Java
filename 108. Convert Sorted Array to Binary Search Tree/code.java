import java.util.*;

class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums,0,nums.length-1);
    }
    public TreeNode sortedArrayToBST(int[] nums,int lo,int hi){
        if(lo>hi) return null;
        int mid=lo+(hi-lo)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=sortedArrayToBST(nums,lo,mid-1);
        node.right=sortedArrayToBST(nums,mid+1,hi);
        return node;
    }
	public void trav(TreeNode node){
		Stack<TreeNode> s=new Stack<>();
		while(true){
			while(node!=null){
				s.push(node);
				node=node.left;
			}
			if(s.empty())
				break;
			node=s.pop();
			System.out.print(node.val+" ");
			node=node.right;
		}
		System.out.println();
		System.out.println("***********");
	}
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] nums1={};
		int[] nums2={1};
		int[] nums3={1,2};
		int[] nums5={-50,-45,-30,-22,-12,-3,-1,55,68,98};
		
		TreeNode node1=s.sortedArrayToBST(nums1);
		TreeNode node2=s.sortedArrayToBST(nums2);
		TreeNode node3=s.sortedArrayToBST(nums3);	
		TreeNode node5=s.sortedArrayToBST(nums5);
		
		s.trav(node1);
		s.trav(node2);
		s.trav(node3);
		s.trav(node5);
	}
}
