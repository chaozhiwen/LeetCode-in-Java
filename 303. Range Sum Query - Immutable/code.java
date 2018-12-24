class NumArray {
    int[] a;
    public NumArray(int[] nums) {
        a=new int[nums.length];
        if(a.length==0) return;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=nums[i];
            a[i]=sum;
        }
    }
    
    public int sumRange(int i, int j) {
        if(i==0) return a[j];
        return a[j]-a[i-1];
    }
}

/* 0~1000随机数 */
class Main{
	public static void main(String[] args){
		int[] a=new int[1000];
		for(int i=0;i<a.length;i++)
			a[i]=(int)(Math.random()*100000);
		NumArray n=new NumArray(a);
		
		System.out.println(n.sumRange(0,100));
		System.out.println(n.sumRange(50,500));
		System.out.println(n.sumRange(450,500));
		System.out.println(n.sumRange(0,10));
		System.out.println(n.sumRange(200,300));
		System.out.println(n.sumRange(301,965));
		System.out.println(n.sumRange(555,666));
		System.out.println(n.sumRange(45,65));
		System.out.println(n.sumRange(789,987));
		System.out.println(n.sumRange(135,458));
	}
}
