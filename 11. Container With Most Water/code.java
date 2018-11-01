import java.util.*;
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
