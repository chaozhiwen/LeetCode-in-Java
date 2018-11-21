import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        Stack<Integer> row=new Stack<>();
        Stack<Integer> colspan=new Stack<>();
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++)
                if(matrix[i][j]==0){
                    row.push(i);
                    colspan.push(j);
                }
        while(!row.empty()){
            for(int i=0;i<matrix[0].length;i++)
                matrix[row.peek()][i]=0;
            row.pop();
        }
        while(!colspan.empty()){
            for(int i=0;i<matrix.length;i++)
                matrix[i][colspan.peek()]=0;
            colspan.pop();
        }
    }
}

/** simple example */
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		s.setZeroes(a);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++)
				System.out.print(a[i][j]);
			System.out.println();
		}
		int[][] b={{1,2,3},{4,0,6},{7,8,9}};
		s.setZeroes(b);
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++)
				System.out.print(b[i][j]);
			System.out.println();
		}
	}
}
