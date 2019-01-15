import java.util.*;

class MyCalendar {
    List<int[]> bottom;
    public MyCalendar() {
        bottom=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int i=0;i<bottom.size();i++)
            if(!canBeAdded(start,end,bottom.get(i)))
                return false;
        bottom.add(new int[]{start,end});
        return true;
    }
    
    public boolean canBeAdded(int start,int end,int[] calendar){
        if(calendar[0]<=start&&start<calendar[1])
            return false;
        if(calendar[0]<end&&end<=calendar[1])
            return false;
        if(start<=calendar[0]&&calendar[1]<=end)
            return false;
        return true;
    }
}
class Main{
	public static void main(String[] args){
		MyCalendar mc=new MyCalendar();
		System.out.println(mc.book(20,50));
		System.out.println(mc.book(50,100));
		System.out.println(mc.book(100,120));
		System.out.println(mc.book(20,130));
		System.out.println(mc.book(100,130));
		System.out.println(mc.book(1,30));
		System.out.println(mc.book(1,20));
		System.out.println(mc.book(1,1000));
		
	}
}
