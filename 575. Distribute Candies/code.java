import java.util.*;

class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> set=new HashSet<>();
        for(int i:candies)
            set.add(i);        
        return Math.min(set.size(),candies.length/2);
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.distributeCandies(new int[]{1,2,3,4,5,6,7,8,9,10}));
		System.out.println(s.distributeCandies(new int[]{1,1,1,1,1,2}));
		System.out.println(s.distributeCandies(new int[]{1,3,5,2,1,2}));
		System.out.println(s.distributeCandies(new int[]{1,2,3,1}));
		System.out.println(s.distributeCandies(new int[]{1,1,1,1,1,1,1,1}));
		
	}
}
