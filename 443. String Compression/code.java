class Solution {
    public int compress(char[] chars) {
        int point=0;
        for(int i=0;i<chars.length;i++){
            int count=1;
            for(int j=i+1;j<chars.length&&chars[i]==chars[j];j++)
                count++;
            chars[point++]=chars[i];
            if(count==1) continue;
            i=i+count-1;
            String c=count+"";
            for(int k=0;k<c.length();k++)
                chars[point++]=c.charAt(k);            
        }
        return point;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		char[] a={'a','a','b','b','c','c','c','c','d','d','d','d','d','d','e','e','e'};
		int i=s.compress(a);
		for(int j=0;j<i;j++)
			System.out.print(a[j]+" ");
		System.out.println();
		
		char[] b={'b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b',
		'b','b','b','b','b','b','b','b','b'};
		i=s.compress(b);
		for(int j=0;j<i;j++)
			System.out.print(b[j]+" ");
		System.out.println();
		
		char[] c={'c','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b',
		'b','b','b','b','b','b','b','b','b','a','a'};
		i=s.compress(c);
		for(int j=0;j<i;j++)
			System.out.print(c[j]+" ");
		System.out.println();
				
	}
}
