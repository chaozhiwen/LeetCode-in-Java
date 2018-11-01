import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
        
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={};
		int[] b={0};
		int[] c={0,1,2,3,4,5,6,7,8,9,10};
		int[] d={0,0,1,2,3,4,5,6,7,8,9,10};
		int[] e={0,1,2,3,4,5,6,7,8,9,10,10};
		int[] f={0,1,2,3,4,5,5,6,7,8,9,10};
		System.out.println("{}:"+s.containsDuplicate(a));
		System.out.println("{0}:"+s.containsDuplicate(b));
		System.out.println("{0,1,2,3,4,5,6,7,8,9,10}:"+s.containsDuplicate(c));
		System.out.println("{0,0,1,2,3,4,5,6,7,8,9,10}:"+s.containsDuplicate(d));
		System.out.println("{0,1,2,3,4,5,6,7,8,9,10,10}:"+s.containsDuplicate(e));
		System.out.println("{0,1,2,3,4,5,5,6,7,8,9,10}:"+s.containsDuplicate(f));
	}
}
