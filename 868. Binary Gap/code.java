import java.util.*;
class Solution {
    public int binaryGap(int N) {
        int ans=0;
        String s=Integer.toBinaryString(N);
        Vector<Integer> v=new Vector<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                v.add(i);
            }
        }
        if(v.size()<2){
            return 0;
        }else{
            int temp=0;
            for(int i=0;i<v.size()-1;i++){
                temp=v.get(i+1)-v.get(i);
                if(temp>ans){
                    ans=temp;
                }
            }
        }
        return ans;
    }
}
