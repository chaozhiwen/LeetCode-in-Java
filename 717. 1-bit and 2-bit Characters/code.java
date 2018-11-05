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
