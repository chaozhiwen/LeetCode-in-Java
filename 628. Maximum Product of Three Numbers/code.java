import java.util.*;
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],nums[0]*nums[1]*nums[nums.length-1]);
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={4,3,2,1,0};
		System.out.println(s.maximumProduct(a));
		int[] b={0,1,2,3,4};
		System.out.println(s.maximumProduct(b));
		int[] c={-1,0,1,2,3};
		System.out.println(s.maximumProduct(c));
		int[] d={-2,-1,1,2,3};
		System.out.println(s.maximumProduct(d));
		int[] e={5,1,2,4,6,8,33,2,1,4,6,7};
		System.out.println(s.maximumProduct(e));
	}
}
