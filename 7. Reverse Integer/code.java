class Solution {
    public int reverse(int x) {
        int num;
        long sum=0;
        while(x!=0){
            sum=(sum*10+x%10);
            x/=10;      
        }
        if(Integer.MAX_VALUE<sum||sum<Integer.MIN_VALUE)
                return 0;
        return (int)sum;
    }
}
