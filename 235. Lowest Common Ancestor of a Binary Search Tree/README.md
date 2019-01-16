## 题目
给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
## 思路
利用BST的特点，左子树<根节点<右子树
```java
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //判断两节点的大致方位
        while(root!=null){
            //如果两节点同时满足小于当前节点的条件，说明两节点一定在当前节点的左子树，那么将指针移向当前节点的左子节点
            if(p.val<root.val&&q.val<root.val)
                root=root.left;
            //如果两节点同时满足大于于当前节点的条件，说明两节点一定在当前节点的右子树，那么将指针移向当前节点的右子节点
            else if(root.val<p.val&&root.val<q.val)
                root=root.right;
            /*
             *  如果不满足上面两条件，说明两节点一左一右分布在当前节点的左右子树中
             *  经过迭代，当前节点一定是深度最深的公共祖先
             *  或者是其中一个节点是令一节点的祖先
             */
            else 
                break;
        }
        return root;
    }
```
## 算法复杂度
**时间复杂度**：O(h)，一定不大于树的高度  
**空间复杂度**：O(1)
