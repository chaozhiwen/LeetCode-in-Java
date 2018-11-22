class Solution {
    public int rotatedDigits(int N){
        int count=0;
        for(int i=1;i<=N;i++){
            String t=i+"";
            Boolean flag=true;
            int countD=0;
            for(int j=0;j<t.length();j++){
                if(t.charAt(j)=='3'||t.charAt(j)=='4'||t.charAt(j)=='7'){
                    flag=false;
                    break;
                }
                if(t.charAt(j)=='2'||t.charAt(j)=='5'||t.charAt(j)=='9'||t.charAt(j)=='6')
                    countD++;
            }
            if(flag&&countD>0)
                count++;
        }
        return count;
    }
}

/** simple example */
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		for(int i=1;i<=10000;i++)
			System.out.println(s.rotatedDigits(i));
	}
}
