class GuessGame{
	int ans;
	GuessGame(){
		ans=(int)(Math.random()*100000000);//答案为1~100000000内随机整数
	}
	public int getAns(){
		return ans;
	}
	public int guess(int m){
		if(ans>m)
			return 1;
		else if(ans<m)
			return -1;
		else
			return 0;
	}
}

class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1,r=n;
        while(l<r){
            int m=l+(r-l)/2;
            if(guess(m)==-1)
                r=m-1;
            else if(guess(m)==1)
                l=m+1;
            else
                return m;
        }
        return r;
    }
}

/*测试答案与猜测答案是否匹配，100次*/
class Main{
	public static void main(String[] args){
		int i=1;
		while(i<=100){
			Solution s=new Solution();
			System.out.println(s.getAns()==s.guessNumber(100000000));
			i++;
		}
	}
}

