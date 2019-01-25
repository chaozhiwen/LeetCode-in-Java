import java.util.*;

class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q=new LinkedList<>();
    }
    
    public int ping(int t) {
        q.add(t);
        while(q.peek()+3000<t)
            q.poll();
        return q.size();
    }
}
class Main{
	public static void main(String[] args){
		RecentCounter r=new RecentCounter();
		
		for(int i=1;i<=10;i++)
			System.out.println(i+":"+r.ping(i));
		System.out.println(1000+":"+r.ping(1000));
		System.out.println(2000+":"+r.ping(2000));
		System.out.println(3000+":"+r.ping(3000));
		System.out.println(3001+":"+r.ping(3001));
		System.out.println(3010+":"+r.ping(3010));
		System.out.println(5000+":"+r.ping(5000));
		System.out.println(10000+":"+r.ping(10000));
	}
}
