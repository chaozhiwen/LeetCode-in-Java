class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]&&j-i<=k){
                    return true;
                }
            }
        }
        return false;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] temp={0};
		int[] a={1,2,3,4,5,6,6};
		int[] b={1,1,2,3,4,5,6};
		int[] c={1,2,3,4,5,6};
		int[] d={1,2,3,4,5,6,1};
		System.out.println("{0},0:"+s.containsNearbyDuplicate(temp,0));
		System.out.println("{1,2,3,4,5,6,6},1:"+s.containsNearbyDuplicate(a,1));
		System.out.println("{1,1,2,3,4,5,6},3:"+s.containsNearbyDuplicate(b,3));
		System.out.println("{1,1,2,3,4,5,6},1:"+s.containsNearbyDuplicate(b,1));
		System.out.println("{1,2,3,4,5,6},1:"+s.containsNearbyDuplicate(c,1));
		System.out.println("{1,2,3,4,5,6,1},5:"+s.containsNearbyDuplicate(d,5));
	}
}
