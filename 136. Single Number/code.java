import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)
            return nums[0];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                i++;
            else
                return nums[i];
        }
        return nums[nums.length-1];
    }
}
/***simple example***/
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9};
		int[] b={56};
		int[] c={93,5,32,54,56,432,123,432,32,56,5,54,93};
		int[] d={5,55,5};
		int[] e={5,5,55};
		int[] f={55,5,5};
		System.out.println(s.singleNumber(a));
		System.out.println(s.singleNumber(b));
		System.out.println(s.singleNumber(c));
		System.out.println(s.singleNumber(d));
		System.out.println(s.singleNumber(e));
		System.out.println(s.singleNumber(f));
	}
}
