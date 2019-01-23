import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==1) return triangle.get(0).get(0);
        
        for(int i=1;i<triangle.size();i++)
            for(int j=0;j<triangle.get(i).size();j++){
                if(j==0)
                    triangle.get(i).set(j,triangle.get(i-1).get(0)+triangle.get(i).get(0));
                else if(j==triangle.get(i).size()-1)
                    triangle.get(i).set(j,triangle.get(i-1).get(j-1)+triangle.get(i).get(j));
                else
                    triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i-1).get(j),triangle.get(i-1).get(j-1)));
            }       
        List<Integer> last=triangle.get(triangle.size()-1);
        int ans=last.get(0);
        for(int i=0;i<last.size();i++)
            ans=Math.min(ans,last.get(i));
        return ans;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		List<Integer> l1=new ArrayList<>();
		l1.add(1);
		List<Integer> l2=new ArrayList<>();
		l2.add(2);l2.add(3);
		List<Integer> l3=new ArrayList<>();
		l3.add(1);l3.add(7);l3.add(6);
		List<Integer> l4=new ArrayList<>();
		l4.add(35);l4.add(5);l4.add(3);l4.add(8);
		List<List<Integer>> l=new ArrayList<>();
		l.add(l1);l.add(l2);l.add(l3);l.add(l4);
		
		System.out.println(s.minimumTotal(l));
	}
}
