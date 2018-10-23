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