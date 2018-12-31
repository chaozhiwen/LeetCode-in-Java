## 题目
给定一个 N 叉树，返回其节点值的前序遍历。
## 思路
深度优先搜索，类似[二叉树的前序遍历](https://github.com/chaozhiwen/LeetCode-in-Java/tree/master/144.%20Binary%20Tree%20Preorder%20Traversal)  
先访问当前结点，然后利用栈结构，将当前的结点的子结点按照从右至左的顺序压栈，逆序压栈可以保证顺序访问。接着将栈顶项弹出，重复以上步骤，直到当前结点为空
## 算法复杂度
**时间复杂度**：O(n)  
**空间复杂度**：O(n)
