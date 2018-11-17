class Solution {
    public int maxProfit(int[] prices) {
        int ans=Integer.MIN_VALUE;
        for(int i=prices.length-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                ans=Math.max(ans,prices[i]-prices[j]);
            }
        }
        if(ans<0) 
            return 0;
        return ans;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={1,2,3,4,5,6,7};
		int[] b={7,6,5,4,3,2,1};
		int[] c={5,5,5,5,5,5,5};
		System.out.println(s.maxProfit(a));
		System.out.println(s.maxProfit(b));
		System.out.println(s.maxProfit(c));
 	}
}
