class Solution {
    public int fib(int N) {
        if(N==0) return 0;
        if(N==1) return 1;
        int pre1=0;
        int pre2=1;
        int ans=0;
        for(int i=2;i<=N;i++){
            ans=pre1+pre2;
            pre1=pre2;
            pre2=ans;
        }        
        return ans;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		for(int i=0;i<47;i++)
			System.out.println(s.fib(i));
	}
}
