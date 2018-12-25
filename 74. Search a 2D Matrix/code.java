class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        
        int[] nums=new int[matrix.length*matrix[0].length];
        for(int i=0,j=0;j<matrix.length;j++){
            for(int k=0;k<matrix[j].length;k++)
                nums[i++]=matrix[j][k];
        }
        
        int lo=0,hi=nums.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<target)
                lo=mid+1;
            else if(nums[mid]>target)
                hi=mid-1;
            else
                return true;
        }
        return false;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[][] a={};
		System.out.println(s.searchMatrix(a,50));//false
		
		int[][] b=new int[20][20];
		int k=0;
		for(int i=0;i<b.length;i++)
			for(int j=0;j<b[i].length;j++)
				b[i][j]=k++;
			
		System.out.println(s.searchMatrix(b,50));//true
		System.out.println(s.searchMatrix(b,0));//true
		System.out.println(s.searchMatrix(b,-1));//false
		System.out.println(s.searchMatrix(b,400));//false
		System.out.println(s.searchMatrix(b,399));//true
		
		
	}
}
