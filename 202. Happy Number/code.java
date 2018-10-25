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
