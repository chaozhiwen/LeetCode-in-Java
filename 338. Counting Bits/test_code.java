class Solution {
    public int[] countBits(int num) {
        int[] a=new int[num+1];
        a[0]=0;
        int j;
        for(int i=1;i<=num;i++){
            j=i;
            while(j!=0){
                if(j%2==1)
                    a[i]++;
                j/=2;
            }
        }
        return a;
    }
}
class Main{
    public static void main(String[] args){
        Solution s=new Solution();
        int[] a=s.countBits(50);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
