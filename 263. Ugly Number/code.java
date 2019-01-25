class Solution {
    public boolean isUgly(int num) {
        if(num==0) return false;
        while(num%2==0)
            num/=2;
        while(num%3==0)
            num/=3;
        while(num%5==0)
            num/=5;
        return num==1;
    }
}

//0~100
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		for(int i=0;i<=100;i++)
			System.out.println(i+":"+s.isUgly(i));
	}
}
