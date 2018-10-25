public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int i=0;
        
        /*I ignored a question that the most bits of Integer is 32
        while(n!=0){
            if(n%2==1)
                i++;
            n/=2;
        }*/
        
        String s=Integer.toBinaryString(n);
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='1')
                i++;
        }
        return i;
    }
}
