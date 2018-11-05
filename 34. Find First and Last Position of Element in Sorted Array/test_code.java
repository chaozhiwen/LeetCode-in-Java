class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a={-1,-1};
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]==target){
                a[0]=i;
                if(nums[j]==target){
                    a[1]=j;
                    break;
                }
                else{
                    j--;
                    continue;
                }
            }else if(nums[j]==target){
                a[1]=j;
                if(nums[i]==target){
                    a[0]=i;
                    break;
                }
                else{
                    i++;
                    continue;
                }
                
            }else{
                i++;
                j--;
            }
        }
        return a;
    }      
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		int[] a={0,1,2,3,4,4,4,4,4,5,6};
		int[] a1=s.searchRange(a,4);
		System.out.print("{0,1,2,3,4,4,4,4,4,5,6},find 4:"+a1[0]+","+a1[1]);
		System.out.println();
		
		int[] b={0,1,2,3,4,4,5,6,7};
		int[] b1=s.searchRange(b,4);
		System.out.print("{0,1,2,3,4,4,5,6,7},find 4:"+b1[0]+","+b1[1]);
		System.out.println();
		
		int[] c={0,1,2,3,4,5,6,7};
		int[] c1=s.searchRange(c,4);
		System.out.print("{0,1,2,3,4,5,6,7},find 4:"+c1[0]+","+c1[1]);
		System.out.println();
		
		int[] d={0,1,2,3,4,5,6,7};
		int[] d1=s.searchRange(d,8);
		System.out.print("{0,1,2,3,4,5,6,7},find 8:"+d1[0]+","+d1[1]);
		System.out.println();
		
		int[] e={};
		int[] e1=s.searchRange(e,0);
		System.out.print("{null},find 0:"+e1[0]+","+e1[1]);
		System.out.println();
	}
}
