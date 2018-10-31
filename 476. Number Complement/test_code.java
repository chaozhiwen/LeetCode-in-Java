class Solution {
    public int findComplement(int num){
        String a=Integer.toBinaryString(num);
        String b="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='0'){
                b+="1";
            }else{
                b+="0";
            }
        }
        return Integer.valueOf(Integer.parseInt(b,2));
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		for(int i=1;i<=1000;i++){
			System.out.println(i+">>>"+s.findComplement(i));
		}
	}
}
