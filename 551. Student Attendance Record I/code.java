class Solution {
    public boolean checkRecord(String s) {
        int countA=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                countA++;
            }else if(s.charAt(i)=='L'){
                int k=1;
                String temp="";
                for(int j=i;j<s.length()&&k<4;j++){
                    temp+=s.charAt(j);
                    k++;
                }
                if(temp.equals("LLL"))
                    return false;
            }
        }
        return countA<=1;
    }
}
