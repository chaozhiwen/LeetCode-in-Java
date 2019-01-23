class Solution {
    public int minPathSum(int[][] grid) {
        for(int i=1;i<grid[0].length;i++)
            grid[0][i]+=grid[0][i-1];
        
        for(int i=1;i<grid.length;i++)
            grid[i][0]+=grid[i-1][0];
        
        for(int i=1;i<grid.length;i++)
            for(int j=1;j<grid[i].length;j++)
                grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
        
        return grid[grid.length-1][grid[0].length-1];
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		int[][] b={{1,2,1},{2,3,4},{9,8,7}};
		int[][] c={{1,1,1,1,1}};
		int[][] d={{1},{1},{1}};
		
		System.out.println(s.minPathSum(a));
		System.out.println(s.minPathSum(b));
		System.out.println(s.minPathSum(c));
		System.out.println(s.minPathSum(d));
	}
}
