import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new LinkedList<>();
        if(numRows==0) return ans;
        
        /*第一行*/
        ans.add(new LinkedList<Integer>());
        ans.get(0).add(1);
        if(numRows==1) return ans;
    
        for(int i=1;i<numRows;i++){//从第二行开始，
            ans.add(new LinkedList<Integer>());//添加新的一行，
            ans.get(i).add(1);//添加边界1。
            for(int j=0;j<ans.get(i-1).size()-1;j++)//从上一行第一个元素开始，
                ans.get(i).add(ans.get(i-1).get(j)+ans.get(i-1).get(j+1));//相邻两元素的和添加到新行中
            ans.get(i).add(1);//最后添加边界1
        }
        return ans;
    }
}
/***simple test***/
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		for(int i=0;i<=33;i++){
			List<List<Integer>> ans=s.generate(i);
			for(int j=0;j<ans.size();j++){
				for(int k=0;k<ans.get(j).size();k++)
					System.out.print(ans.get(j).get(k)+" ");
				
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}
}
