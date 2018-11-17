class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
            int j=0;
            int k=A[i].length-1;
            while(j<=k){
                swap(A[i],j,k);
                j++;
                k--;
            }
        }
        for(int i=0;i<A.length;i++)
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]==0)
                    A[i][j]=1;
                else
                    A[i][j]=0;
            }
        return A;
    }
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[][] a={{0,1,1,0},{1,0,1,0},{0,1,1,0}};
		int[][] b={{1,0,1},{0,0,0},{0,1,0}};
		a=s.flipAndInvertImage(a);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		b=s.flipAndInvertImage(b);
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
 	}
}
