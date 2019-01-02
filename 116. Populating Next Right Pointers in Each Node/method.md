## 题目
[题目链接](https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/)
## 思路
[层次遍历](https://github.com/chaozhiwen/LeetCode-in-Java/tree/master/102.%20Binary%20Tree%20Level%20Order%20Traversal)  
广度优先搜索，利用队列结构，同一层的结点总是顺序存放在队列中。在访问同一层结点前，先声明一个计数器，记录当前层的结点个数，每次结点出队后，让其next指针
指向当前队首结点(同层元素，从左指向右)，计数器递减。当计数器递减至1时，说明这一层结点已经访问完毕，此时，出队结点的next指针指向null。
## 算法复杂度
**时间复杂度**：O(n)  
**空间复杂度**：O(n)
