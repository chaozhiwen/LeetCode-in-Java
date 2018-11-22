class Solution {
    public String maskPII(String S) {
        String ans="";
        if(S.contains("@")){
            ans+=Character.toLowerCase(S.charAt(0));
            String temp="";
            int i=0;
            while(i<S.length()){
                if(S.charAt(i+1)=='@'){
                    temp=Character.toLowerCase(S.charAt(i))+"";
                    break;
                }
                i++;
            }
            ans+=("*****"+temp);
            for(i+=1;i<S.length();i++)
                ans+=Character.toLowerCase(S.charAt(i));
        }else{
            String temp="";
            for(int i=0;i<S.length();i++)
                if(Character.isDigit(S.charAt(i)))
                    temp+=S.charAt(i);
                
            String t="";
            for(int i=temp.length()-1,j=1;j<=4;j++,i--)
                t=temp.charAt(i)+t;
            
            if(temp.length()==10){
                ans="***-***-"+t;
            }else if(temp.length()==11){
                ans="+*-***-***-"+t;
            }else if(temp.length()==12){
                ans="+**-***-***-"+t;
            }else if(temp.length()==13){
                ans="+***-***-***-"+t;
            }         
        }
        return ans;
    }
}

/** simple example */
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		String s1="chaozhiwen@github.com";
		String s2="cc@github.com";
		String s3="c@github.com";
		String s4="12(345)6-5-3-9-8";
		String s5="9-89-7-4-5-6-2-1-3-0";
		String s6="123(45+67-891-01+";
		String s7="9/4\3\7\6/1-5-7-8-4-619";
		String s8="1036987425";
		String s9="93654826952";
		String s10="294581038473";
		String s11="2834264856442";
		String s12="chao.zhi.wen@github.com";
		String s13="CHAOZHIWEN@GITHUB.COM";
		String s14="ChaozhiweN@GITHUB.com";
		System.out.println(s.maskPII(s1));
		System.out.println(s.maskPII(s2));
		System.out.println(s.maskPII(s3));
		System.out.println(s.maskPII(s4));
		System.out.println(s.maskPII(s5));
		System.out.println(s.maskPII(s6));
		System.out.println(s.maskPII(s7));
		System.out.println(s.maskPII(s8));
		System.out.println(s.maskPII(s9));
		System.out.println(s.maskPII(s10));
		System.out.println(s.maskPII(s11));
		System.out.println(s.maskPII(s12));
		System.out.println(s.maskPII(s13));
		System.out.println(s.maskPII(s14));
		
	}
}
