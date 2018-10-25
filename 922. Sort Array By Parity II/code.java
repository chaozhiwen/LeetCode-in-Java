class Solution {
    public int[] sortArrayByParityII(int[] A) {
        Stack<Integer> odd=new Stack();
        Stack<Integer> even=new Stack();
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                odd.push(A[i]);
            }else{
                even.push(A[i]);
            }
        }
        for(int i=0;i<A.length;i++){
            if(i%2==0){
                A[i]=odd.pop();
            }else{
                A[i]=even.pop();
            }
        }
        return A;
    }
}
