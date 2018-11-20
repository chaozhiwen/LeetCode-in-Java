class Codec {
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        char[] a=longUrl.toCharArray();
        int i=0;
        int j=a.length-1;
        while(i<j){
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return new String(a);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        char[] a=shortUrl.toCharArray();
        int i=0;
        int j=a.length-1;
        while(i<j){
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return new String(a);
    }
}
class Main{
	public static void main(String[] args){
		Codec c=new Codec();
		String s="http://www.baidu.com";
		System.out.println(c.encode(s));
		System.out.println(c.decode(c.encode(s)));
		s="www.github.com/chaozhiwen";
		System.out.println(c.encode(s));
		System.out.println(c.decode(c.encode(s)));
 	}
}
