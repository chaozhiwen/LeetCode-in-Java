//It's not the best key.It spends much time
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
