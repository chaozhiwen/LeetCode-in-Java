class Solution {
    public boolean isPowerOfTwo(int n) {        
     /**Exceeding the time limit**/        
        /*int num=2;
        if(n==1)
            return true;
        while(num<=n){
            if(num==n){
                return true;
            }
            num*=2;
        }
        return false;*/
    /*****************************/
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
