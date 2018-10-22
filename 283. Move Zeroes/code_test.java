/*
 * it is not directly that i write it,i consult other algorithms to improve this program
 */
class Solution{
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        for(int tmp=nums.length-1;tmp>=count;tmp--){
            nums[tmp]=0;
        }
    }
}
class Main {
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] a={0};
		s.moveZeroes(a);
		System.out.print("{0}:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int[] b={0,0};
		s.moveZeroes(b);
		System.out.print("{0,0}:");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
		System.out.println();
		int[] c={1,2,3};
		s.moveZeroes(c);
		System.out.print("{1,2,3}:");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();
		int[] d={0,1,2};
		s.moveZeroes(d);
		System.out.print("{0,1,2}:");
		for(int i=0;i<d.length;i++){
			System.out.print(d[i]+" ");
		}
		System.out.println();
		int[] e={0,1,2,3,0};
		s.moveZeroes(e);
		System.out.print("{0,1,2,3,0}:");
		for(int i=0;i<e.length;i++){
			System.out.print(e[i]+" ");
		}
		System.out.println();
		int[] f={0,1,0,2,0,3,0};
		s.moveZeroes(f);
		System.out.print("{0,1,0,2,0,3,0}:");
		for(int i=0;i<f.length;i++){
			System.out.print(f[i]+" ");
		}
		System.out.println();

	}
}
