class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<=nums.length;i++){//sum that from 0 to num.length
            sum+=i;
        }
        int s=0;
        for(int i=0;i<nums.length;i++){//array's sum
            s+=nums[i];
        }
        return sum-s;
    }
}
class Main{
	public static void main(String[] args){
		int[] a={0,2};
		int[] b={9,4,1,2,5,7,8,0,3};
		int[] c={10,9,8,7,6,5,1,3,0,4};
		Solution s=new Solution();
		System.out.println(s.missingNumber(a));
		System.out.println(s.missingNumber(b));
		System.out.println(s.missingNumber(c));
	}
}
