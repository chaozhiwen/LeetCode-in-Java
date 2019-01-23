class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid=new int[m][n];
        for(int i=0;i<n;i++)
            grid[0][i]=1;
        for(int i=0;i<m;i++)
            grid[i][0]=1;
        
        for(int i=1;i<m;i++)
            for(int j=1;j<n;j++)
                grid[i][j]=grid[i-1][j]+grid[i][j-1];
        
        return grid[m-1][n-1];
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.uniquePaths(5,1));
		System.out.println(s.uniquePaths(1,5));
		System.out.println(s.uniquePaths(3,3));
		System.out.println(s.uniquePaths(2,8));
		System.out.println(s.uniquePaths(3,9));
		System.out.println(s.uniquePaths(9,9));
	}
}
