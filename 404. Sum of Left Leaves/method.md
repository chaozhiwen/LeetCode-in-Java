## 题目
计算给定二叉树的所有左叶子之和。
## 思路
在层次遍历的基础上，每次访问完一个结点时，判断此结点的左子结点是否为叶子结点
## 算法复杂度
**时间复杂度**：O(n)，遍历树的时间开销  
**空间复杂度**：O(n)，遍历树时维护队列的空间