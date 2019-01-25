class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len=cost.length;
        if(len==1) return cost[0];
        if(len==2) return Math.min(cost[0],cost[1]);
        
        for(int i=2;i<len;i++)
            cost[i]+=Math.min(cost[i-1],cost[i-2]);
        
        return Math.min(cost[len-1],cost[len-2]);
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		System.out.println(s.minCostClimbingStairs(new int[]{15,21,32,65}));
		System.out.println(s.minCostClimbingStairs(new int[]{1,2,1,1,2,2,1,2,1,2,1}));
		System.out.println(s.minCostClimbingStairs(new int[]{1,1,2}));
		System.out.println(s.minCostClimbingStairs(new int[]{2,1,1}));
		System.out.println(s.minCostClimbingStairs(new int[]{1,2,2,1}));
		System.out.println(s.minCostClimbingStairs(new int[]{1,1,2,2}));
		System.out.println(s.minCostClimbingStairs(new int[]{2,2,1,1}));
		System.out.println(s.minCostClimbingStairs(new int[]{1,2,1,2}));
		System.out.println(s.minCostClimbingStairs(new int[]{2,1,2,1}));
	}
}
