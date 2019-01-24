## 题目
给定一个方形整数数组 A，我们想要得到通过 A 的下降路径的最小和。  
下降路径可以从第一行中的任何元素开始，并从每一行中选择一个元素。在下一行选择的元素和当前行所选元素最多相隔一列。
## 思路
**动态规划**  
最小路径和一定会落在最后一行，因此将最后一行每一位置的最小路径和计算出即可  
要计算最后一行的最小路径，必须先计算出上一行中与之相邻的最小路径和，如此往复，直到推导至第一行，因为第一行的位置不需要计算
```java
//关键代码
for(int i=1;i<len;i++)//从第二行开始
      for(int j=0;j<len;j++){
          if(j==0)//当前位置为首元素时，在上一行中没有左邻元素
              A[i][j]+=Math.min(A[i-1][j],A[i-1][j+1]);
          else if(j==len-1)//当前位置为尾元素时，在上一行中没有右邻元素
              A[i][j]+=Math.min(A[i-1][j-1],A[i-1][j]);
          else//若上一行中有左、中、右邻元素时，取最小者作为路径
              A[i][j]+=Math.min(Math.min(A[i-1][j-1],A[i-1][j]),A[i-1][j+1]);
      }
```
最后，在最后一行中，寻找最小路径和
```java
int res=A[len-1][0];
        for(int x:A[len-1])
            res=Math.min(x,res);
```
## 算法复杂度
**时间复杂度**：O(n*n)  
**空间复杂度**：O(1)