import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l=new LinkedList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                l.add(nums[i]);
                i++;
            }
        }
        return l;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={0,1,2,3,4};
		int[] b={1,2,2,4,5,6,7,8,9,10,1};
		int[] c={11,1,11,2,3,141};
		List<Integer> l1=s.findDuplicates(a);
		List<Integer> l2=s.findDuplicates(b);
		List<Integer> l3=s.findDuplicates(c);
		for(int i=0;i<l1.size();i++)
			System.out.print(l1.get(i));
		System.out.println();
		for(int i=0;i<l2.size();i++)
			System.out.print(l2.get(i)+" ");
		System.out.println();
		for(int i=0;i<l3.size();i++)
			System.out.print(l3.get(i));
		System.out.println();
 	}
}
