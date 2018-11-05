import java.util.*;
class Solution {
    public boolean isOneBitCharacter(int[] bits){
        Vector<Integer> v=new Vector<>();
        for(int i=0;i<bits.length;i++){
            if(bits[i]==1){
                v.add(bits[i++]);
            }else{
                v.add(bits[i]);
            }
        }
        return v.get(v.size()-1)==0;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={0};
		System.out.println("{0}:"+s.isOneBitCharacter(a));
		int[] b={1};
		System.out.println("{1}:"+s.isOneBitCharacter(b));
		int[] c={0,1,0,1,0};
		System.out.println("{0,1,0,1,0}:"+s.isOneBitCharacter(c));
		int[] d={1,1,1,1,1};
		System.out.println("{1,1,1,1,1}:"+s.isOneBitCharacter(d));
		int[] e={0,0,0,0,0};
		System.out.println("{0,0,0,0,0}:"+s.isOneBitCharacter(e));

	}
}
