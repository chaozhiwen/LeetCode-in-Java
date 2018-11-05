class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a={-1,-1};
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]==target){
                a[0]=i;
                if(nums[j]==target){
                    a[1]=j;
                    break;
                }else{
                    j--;
                    continue;
                }
            }
            if(nums[j]==target){
                a[1]=j;
                if(nums[i]==target){
                    a[0]=i;
                    break;
                }else{
                    i++;
                    continue;
                }                
            }
            i++;
            j--;
        }
        return a;
    }      
}
