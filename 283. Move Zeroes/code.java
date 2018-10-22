class Solution{
    public void moveZeroes(int[] nums) {
        int count=0;//slow pointer
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        for(int tmp=nums.length-1;tmp>=count;tmp--){
            nums[tmp]=0;
        }
    }
}
