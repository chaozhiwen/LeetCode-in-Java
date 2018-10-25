class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        while(n!=0){
            if(n%2==0){
                n/=2;
            }else if(n==1){
                return true;
            }else{
                return false;
                }
        }
        return true;
    }
}
class Main {
	public static void main(String[] args) {
		Solution s=new Solution();
		for(int i=0;i<=32;i++){
			System.out.print(i+":");
			System.out.println(s.isPowerOfTwo(i));
		}		
	}
}
