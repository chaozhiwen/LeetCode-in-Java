## 问题 ##
给定一个二进制数组， 计算其中最大连续1的个数。
## 思路 ##
1.定义一个计数器count和一个存储器ans。count用来给连续的1计数，ans用来存储计数器之前的最大连续1的个数。  
2.遍历数组。遇1时，计数器count+1。遇0时，比较当前计数器的值和此前最大值，将值较大的赋给ans，计数器count归0。  
3.最后，末尾元素可能为0也可能为1，归为一种情况，再将ans和count的值作以比较，返回较大的。
## 算法复杂度 ##
**时间复杂度** O(n)  
**空间复杂度** O(1)
