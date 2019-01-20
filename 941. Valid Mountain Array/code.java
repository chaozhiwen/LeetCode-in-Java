class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length<3) return false;
        int index=0,max=A[0];
        for(int i=0;i<A.length;i++)
            if(max<A[i]){
                max=A[i];
                index=i;
            }
        if(index==A.length-1||index==0) return false;
        for(int i=0;i<index-1;i++)
            if(A[i]>=A[i+1])
                return false;      
        for(int i=index;i<A.length-1;i++)
            if(A[i]<=A[i+1])
                return false;
        return true;   
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.validMountainArray(new int[]{1,2,3,4,5,6,7,8,7,6,5,4,3,2,1}));
		System.out.println(s.validMountainArray(new int[]{1,1,2,3,4,3,2,1}));
		System.out.println(s.validMountainArray(new int[]{1,2,3,2,1,1}));
		System.out.println(s.validMountainArray(new int[]{1,2,3,4,5,5,6,5,4,3,2,1}));
		System.out.println(s.validMountainArray(new int[]{1,2,3,4,5,6,7,5,4,4,3,2,1}));
		System.out.println(s.validMountainArray(new int[]{1,2,3,4,4,3,2,1}));
		System.out.println(s.validMountainArray(new int[]{1,1,1,1,1}));
	}
}
