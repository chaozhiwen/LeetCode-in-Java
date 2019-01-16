## 题目
给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
## 思路
有两种情况：  
1.两节点分别在(根)节点的左右子树中，则(根)节点为LCA  
2.两节点在同一子树中，一个节点是另一个节点的祖先
```java
//递归
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root==null||root==p||root==q) return root;//对于当前节点，如果访问到p或q，则立即返回

    //定义两个TreeNode变量--left、right
    TreeNode left=lowestCommonAncestor(root.left,p,q);//left表示在左子树中寻找到的LCA
    TreeNode right=lowestCommonAncestor(root.right,p,q);//right表示在右子树中寻找到的LCA

    if(left==null) return right;//说明左子树不符合条件
    if(right==null) return left;//同上
    return root;//如果左、右都不为null，那么当前节点是LCA
}
```
## 算法复杂度
**时间复杂度**：O(n)，n为节点数  
**空间复杂度**：O(n)，递归栈
