class Solution {
    public int minFallingPathSum(int[][] A) {
        int len=A.length;      
        for(int i=1;i<len;i++)
            for(int j=0;j<len;j++){
                if(j==0)
                    A[i][j]+=Math.min(A[i-1][j],A[i-1][j+1]);
                else if(j==len-1)
                    A[i][j]+=Math.min(A[i-1][j-1],A[i-1][j]);
                else
                    A[i][j]+=Math.min(Math.min(A[i-1][j-1],A[i-1][j]),A[i-1][j+1]);
            }       
        int res=A[len-1][0];
        for(int x:A[len-1])
            res=Math.min(x,res);       
        return res;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.minFallingPathSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
		System.out.println(s.minFallingPathSum(new int[][]{{1,2},{4,-5}}));
	}
}
