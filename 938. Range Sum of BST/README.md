## 题目
给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
## 思路
```java
/*
 *  两个很重要的参数，下界L和上界R形成了一个区间--[L,R]
 *  有三种情况：
 *  区间在左子树中
 *  区间在右子树中
 *  区间横跨左右子树
 *  换做迭代的方式，BST的中序遍历，求L->R的范围和
 */
public int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null) return 0;
        //如果节点的值大于上界，说明区间在左子树中，对左子树进行递归
        if(root.val>R)
            return rangeSumBST(root.left,L,R);
        //如果节点的值小于下界，说明区间在右子树中，对右子树进行递归
        else if(root.val<L)
            return rangeSumBST(root.right,L,R);
        //否则，说明区间横跨左右子树，将当前节点的值带入，再分别对左右子树递归
        else
            return root.val+rangeSumBST(root.left,L,R)+rangeSumBST(root.right,L,R);
        
    }
```
## 算法复杂度
**时间复杂度**：O(n),递归的深度与树节点数成正比  
**空间复杂度**：O(n)，递归栈
