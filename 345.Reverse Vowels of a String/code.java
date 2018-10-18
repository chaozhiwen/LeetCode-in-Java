import java.util.Vector;
class Solution {
    public String reverseVowels(String s) {
        if(s.length()==1||s.length()==0)
            return s;
        Vector<Integer> v=new Vector();//记录元音位置
        char[] a=s.toCharArray();
        //扫描字符串
        for(int i=0;i<s.length();i++){
            //发现元音字母
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){
                v.add(i);//记录下标
            }
        }
        if(!v.isEmpty()){
            //双指针
            int p=0;//指向第一个元音位置
            int q=v.size()-1;//指向最后一个元音位置
            while(p<=q){
                change(a,v.get(p),v.get(q));
                p++;
                q--;
            }
        }
        return String.valueOf(a);
    }
    //交换
    public static void change(char[] a,int i,int j){
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}