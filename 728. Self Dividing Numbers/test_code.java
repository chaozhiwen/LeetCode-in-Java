import java.util.*;
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        int tmp;
        String s;
        List<Integer> l=new ArrayList();
        int j;
        for(int i=left;i<=right;i++){
            s=i+"";
            for(j=0;j<s.length();j++){
                if(s.charAt(j)=='0')
                    break;
                if(i%Integer.parseInt(s.charAt(j)+"")!=0){
                    break;
                }                
            }
            if(j==s.length()){
                l.add(i);
            }
        }
        return l;
    }
} 
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		List<Integer> l;
		l=s.selfDividingNumbers(20,30);
		System.out.print("20 to 30:");
		for(int i=0;i<l.size();i++){
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		l=s.selfDividingNumbers(0,100);
		System.out.print("0 to 100:");
		for(int i=0;i<l.size();i++){
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		l=s.selfDividingNumbers(100,10000);
		System.out.print("100 to 10000:");
		for(int i=0;i<l.size();i++){
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
	}
}
