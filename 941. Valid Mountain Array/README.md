## 题目
山脉数组：
A.length >= 3
在 0 < i < A.length - 1 条件下，存在 i 使得：  
A[0] < A[1] < ... A[i-1] < A[i]  
A[i] > A[i+1] > ... > A[B.length - 1]
## 思路
```java
    public boolean validMountainArray(int[] A) {
        if(A.length<3) return false;
        //1.找到山脉顶峰元素下标index
        int index=0,max=A[0];
        for(int i=0;i<A.length;i++)
            if(max<A[i]){
                max=A[i];
                index=i;
            }
        if(index==A.length-1||index==0) return false;//判断是否出现在首或尾
        //2.判断顶峰元素之前序列是否单调递增
        for(int i=0;i<index-1;i++)
            if(A[i]>=A[i+1])
                return false;      
        //3.判断顶峰元素之后序列是否单调递减
        for(int i=index;i<A.length-1;i++)
            if(A[i]<=A[i+1])
                return false;
        return true;   
    }
}
```
## 算法复杂度
**时间复杂度**：O(n)，找最值需要遍历数组O(n)，判断单调性需要遍历数组O(n),实际O(2n)  
**时间复杂度**：O(1)
