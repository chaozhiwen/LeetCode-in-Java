class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(true){
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            if(sum<10){
                break;
            }else{
                num=sum;
                sum=0;
            }
        }
        return sum;
    }
}
class Main {
	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println("38--->"+s.addDigits(38));
		System.out.println("1--->"+s.addDigits(1));
		System.out.println("9876543--->"+s.addDigits(9876543));
		System.out.println("1000--->"+s.addDigits(1000));
	}
}
