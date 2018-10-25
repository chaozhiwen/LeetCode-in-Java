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
