## 题目
给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于[n/2]的元素。
## 思路
如果数组是有序的，那么众数一定在数组的中间位置，重点在于排序
```java
    //快速排序
    private void sort(int[] nums,int lo,int hi){
        if(lo>=hi) return;
        int i=lo,j=hi;
        
        //找到轴点，并令轴点之前的元素总是小于轴点之后的元素
        while(i<j){
            while(i<j&&nums[j]>=nums[lo])
                j--;
            while(i<j&&nums[i]<=nums[lo])
                i++;
            if(i<j)
                swap(nums,i,j);
        }
        swap(nums,lo,i);//将首元素放入轴点
        //分别对轴点左侧和右侧元素进行递归调用
        sort(nums,lo,i-1);
        sort(nums,i+1,hi);
    }
    
    private void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
```
## 算法复杂度
**时间复杂度**：O(n*log n),快排的时间开销  
**空间复杂度**：O(1)
