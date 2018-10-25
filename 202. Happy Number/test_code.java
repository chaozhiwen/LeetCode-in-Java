class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(true){
            while(n!=0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            if(sum==1||sum==7){
                break;
            }else if(sum==2||sum==3||sum==4||sum==5||sum==6||sum==8||sum==9||sum==0){
                return false;
            }else{
                n=sum;
                sum=0;
            }
        }
        return true;
    }
}
class Main {
	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println("10--->"+s.isHappy(10));
		System.out.println("11--->"+s.isHappy(11));
		System.out.println("22--->"+s.isHappy(22));
		System.out.println("13--->"+s.isHappy(13));
		System.out.println("14--->"+s.isHappy(14));
		System.out.println("55--->"+s.isHappy(55));
		System.out.println("16--->"+s.isHappy(16));
		System.out.println("17--->"+s.isHappy(17));
		System.out.println("18--->"+s.isHappy(18));
		System.out.println("19--->"+s.isHappy(19));
		System.out.println("2147483647--->"+s.isHappy(2147483647));		
	}
}
