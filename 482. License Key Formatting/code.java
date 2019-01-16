class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuffer s=new StringBuffer();
        if(K==0) return S.toUpperCase();
        for(int i=0;i<S.length();i++)
            if(S.charAt(i)!='-')
                s.append(S.charAt(i));
        
        for(int i=s.length()-1;i>=0;i--){
            int count=K;
            while(count-->1&&i>=0)
                i--;
            if(i>0)
                s.insert(i,'-');
        }
        return s.toString().toUpperCase();
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.licenseKeyFormatting("4ds5-8d9s8-88ds",4));
		System.out.println(s.licenseKeyFormatting("4ds5-8d9s8-88ds",3));
		System.out.println(s.licenseKeyFormatting("4ds5-8d9s8-88ds",2));
		System.out.println(s.licenseKeyFormatting("4ds5-8d9s8-88ds",1));
		System.out.println(s.licenseKeyFormatting("-----",2));
		System.out.println(s.licenseKeyFormatting("8s7r5e7sa54e",1));
		System.out.println(s.licenseKeyFormatting("8s7r5e7sa54e",2));
		System.out.println(s.licenseKeyFormatting("8s7r5e7sa54e",3));
		System.out.println(s.licenseKeyFormatting("8s7r5e7sa54e",4));
		System.out.println(s.licenseKeyFormatting("",4));
		System.out.println(s.licenseKeyFormatting("65689sds48sa1d2sa48s4a8d",100));
		System.out.println(s.licenseKeyFormatting("s8qs2h9t8",0));
		
	}
}
