class Solution {
    //brute force
    public int maxArea(int[] height) {
        int maximum=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                maximum=Math.max(maximum,Math.min(height[i],height[j])*(j-i));
                //Math.min(height[i],height[j])*(j-i):compute Area of each interval 
            }
        }
        return maximum;
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={10};
		int[] b={0,6};
		int[] c={10,1};
		int[] d={20,10,5,50,60};
		int[] e={10,11,12,13,14,15,16,17};
		int[] f={17,16,15,14,13,12,11,10};
		System.out.println("{10},maximum="+s.maxArea(a));
		System.out.println("{0,6},maximum="+s.maxArea(b));
		System.out.println("{10,1},maximum="+s.maxArea(c));
		System.out.println("{20,10,5,50,60},maximum="+s.maxArea(d));
		System.out.println("{10,11,12,13,14,15,16,17},maximum="+s.maxArea(e));
		System.out.println("{17,16,15,14,13,12,11,10},maximum="+s.maxArea(f));
	}
}
