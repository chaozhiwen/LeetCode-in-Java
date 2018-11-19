import java.util.*;
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={1};
		int[] b={1,10,2,9,3,8,4,7,5,6};
		int[] c={10,100,11,1000,12,10000,13,100000,14,1000000};
		System.out.println(s.arrayPairSum(a));
		System.out.println(s.arrayPairSum(b));
		System.out.println(s.arrayPairSum(c));
 	}
}
