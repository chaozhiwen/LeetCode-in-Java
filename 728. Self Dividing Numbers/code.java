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
