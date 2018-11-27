class Solution {
    public int countPrimeSetBits(int L, int R) {
        int ans=0;
        for(int i=L;i<=R;i++){
            String s=Integer.toBinaryString(i);//转换成二进制
            int count=0;
            //计数，二进制数中的1
            for(int j=0;j<s.length();j++)
                if(s.charAt(j)=='1')
                    count++;
            if(count==1)
                continue;
            //判断质数
            boolean flag=true;
            for(int k=2;k<=count/2;k++)
                if(count%k==0){
                    flag=false;
                    break;
                }
            if(flag)
                ans++;
        }
        return ans;
    }
}
/***simple example***/
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.countPrimeSetBits(1,1000000));
		
	}
}
