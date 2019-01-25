## 题目
给定二叉树根结点 root ，此外树的每个结点的值要么是 0，要么是 1。  
返回移除了所有不包含 1 的子树的原二叉树。  
( 节点 X 的子树为 X 本身，以及所有 X 的后代。)
## 思路
```java
/*
 *  递归调用
 *  对(根)节点的左右子节点分别递归，找到叶子节点
 *  如果叶子节点的值为0，则令其指向空
 */
public TreeNode pruneTree(TreeNode root) {
        if(root==null) return root;
        root.left=pruneTree(root.left);
        root.right=pruneTree(root.right);
        if(root.left==null&&root.right==null&&root.val==0)
            return null;
        return root;
    }
```
## 算法复杂度
**时间复杂度**：O(n)，遍历树  
**空间复杂度**：O(n)，递归栈
