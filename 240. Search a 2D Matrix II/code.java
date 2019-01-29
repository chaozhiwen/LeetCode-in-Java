class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        int i=matrix.length-1,j=0;
        while(i>=0&&j<matrix[0].length){
            if(matrix[i][j]==target) return true;
            if(matrix[i][j]>target) i--;
            else j++;
        }
        return false;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		System.out.println(s.searchMatrix(new int[][]{{1,2,3},{4,5,6},{7,8,9}},5));
		System.out.println(s.searchMatrix(new int[][]{{1,2,3},{4,5,6},{7,8,9}},10));
		System.out.println(s.searchMatrix(new int[][]{{1,2,3},{4,5,6},{7,8,9}},0));
		System.out.println(s.searchMatrix(new int[][]{},5));
	}
}
