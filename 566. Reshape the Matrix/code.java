class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c!=nums.length*nums[0].length)
            return nums;
        int[] n=new int[r*c];
        int i=0;
        for(int j=0;j<nums.length;j++)
            for(int k=0;k<nums[j].length;k++){
                n[i]=nums[j][k];
                i++;
            }
        int[][] ans=new int[r][c];
        i=0;
        for(int j=0;j<ans.length;j++)
            for(int k=0;k<ans[j].length;k++){
                ans[j][k]=n[i];
                i++;
            }
        return ans;
    }
}
/*** test ***/
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		int[][] a1=s.matrixReshape(a,1,9);
		int[][] a2=s.matrixReshape(a,4,2);
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a1[i].length;j++)
				System.out.print(a1[i][j]+"  ");
			System.out.println();
		}
		for(int i=0;i<a2.length;i++){
			for(int j=0;j<a2[i].length;j++)
				System.out.print(a2[i][j]+"  ");
			System.out.println();
		}
 	}
}
