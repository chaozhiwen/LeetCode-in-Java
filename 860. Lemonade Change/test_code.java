class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five++;
            }else if(bills[i]==10){
                if(five>0){
                    ten++;
                    five--;
                }else{
                    return false;
                }
            }else{
                if(five>0&&ten>0){
                    five--;
                    ten--;
                }else if(five>2){
                    five-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={5,5,5,5,5,5};
		int[] b={10};
		int[] c={20};
		int[] d={5,5,10,5,10,20};
		int[] e={5,5,5,5,10,10,5,5,5,5,5,20,20};
		System.out.println(s.lemonadeChange(a));
		System.out.println(s.lemonadeChange(b));
		System.out.println(s.lemonadeChange(c));
		System.out.println(s.lemonadeChange(d));
		System.out.println(s.lemonadeChange(e));
	}
}
