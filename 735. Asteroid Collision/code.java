import java.util.*;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(s.empty()||asteroids[i]>0){
                s.push(asteroids[i]);
                continue;
            }
            while(true){
                if(s.peek()<0){
                    s.push(asteroids[i]);
                    break;
                }else{
                    if(s.peek()>-asteroids[i])
                        break;
                    else if(s.peek()==-asteroids[i]){
                        s.pop();
                        break;
                    }else{
                        s.pop();
                        if(s.empty()){
                            s.push(asteroids[i]);
                            break;
                        }
                        
                    }
                }
            }
        }
        int[] a=new int[s.size()];
        for(int i=a.length-1;i>=0;i--)
            a[i]=s.pop();
        return a;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={-1,-2,-3,1,2,3};
		a=s.asteroidCollision(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int[] b={1,2,3,-1,-2,-3};
		b=s.asteroidCollision(b);
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		int[] c={1,-1,2,-2,3,-3};
		c=s.asteroidCollision(c);
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		int[] e={10,20,-50};
		e=s.asteroidCollision(e);
		for(int i=0;i<e.length;i++){
			System.out.print(e[i]+" ");
		}
		System.out.println();
		
		int[] d={1,-1};
		d=s.asteroidCollision(d);
		for(int i=0;i<d.length;i++){
			System.out.print(d[i]+" ");
		}
		System.out.println();
	}
}
