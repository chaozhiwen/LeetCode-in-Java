class Solution{
    public int romanToInt(String s) {
        int num=0;
        int[] a=new int[s.length()];
        for(int i=0;i<a.length;i++){//roman to integer
            a[i]=roman(s.charAt(i));
        }
        for(int i=0;i<a.length-1;i++){//remove inverted sequence
            if(a[i]<a[i+1]){
                a[i+1]-=a[i];
                a[i]=0;
            }
        }
        for(int i=0;i<a.length;i++){//add every element
            num+=a[i];
        }
        return num;
    }
    
    //transform roman into integer
    public static int roman(char i){
        if(i=='I'){
            return 1;
        }else if(i=='V'){
            return 5;
        }else if(i=='X'){
            return 10;
        }else if(i=='L'){
            return 50;
        }else if(i=='C'){
            return 100;
        }else if(i=='D'){
            return 500;
        }else{
            return 1000;
        }
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println("III:"+s.romanToInt("III"));
		System.out.println("IV:"+s.romanToInt("IV"));
		System.out.println("XI:"+s.romanToInt("XI"));
		System.out.println("XIV:"+s.romanToInt("XIV"));
		System.out.println("IVX:"+s.romanToInt("IVX"));
		System.out.println("IXV:"+s.romanToInt("IXV"));
		System.out.println("IVMVILX:"+s.romanToInt("IVMVILX"));
		
	}
}
