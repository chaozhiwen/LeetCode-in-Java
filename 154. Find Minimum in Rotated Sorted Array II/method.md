## 思路 ##
[参见：153.Find Minimum in Rotated Sorted Array](https://github.com/chaozhiwen/LeetCode-in-Java/tree/master/153.%20Find%20Minimum%20in%20Rotated%20Sorted%20Array)
## 进阶 ##
**说明**：  
这道题是[153.寻找旋转排序数组中的最小值](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/description/)的延伸题目。  
允许重复会影响算法的时间复杂度吗？会如何影响，为什么？  
**思路：**  
对算法复杂度没有影响，因为这道题说白了，就是寻找数组中的最小元素，部分有序也可看作是无序。  
因此，最好情况是O(1)，也就是最后一个元素作为旋转的点。而最坏情况是O(n-1),第一个或重复元素作为旋转的点。
