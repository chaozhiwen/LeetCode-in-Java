## 题目
给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树
## 思路
BST的插入，首先找到插入位置，该位置一定是BST的叶子节点的孩子(null)。
```java
//递归
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        
       /*
        *  如果当前节点的值大于待插入的值，那么在左子树中寻找
        *  如果是叶子节点，那么此节点的左孩子则是待插入节点
        *  否则，对左子树递归查找
        */
        if(root.val>val){
            if(root.left==null){
                root.left=new TreeNode(val);
                return root;    
            }
            insertIntoBST(root.left,val);
        }
       /*
        *  如果当前节点的值小于待插入的值，那么在右子树中寻找
        *  如果是叶子节点，那么此节点的右孩子则是待插入节点
        *  否则，对右子树递归查找
        */
        else{
            if(root.right==null){
                root.right=new TreeNode(val);
                return root;
            }
            insertIntoBST(root.right,val);
        }
        return root;
    }
}
```
```java
//迭代
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode node=root;//辅助指针
        
        while(node!=null){
       /*
        *  如果当前节点的值大于待插入的值，那么在左子树中寻找
        *  如果是叶子节点，那么此节点的左孩子则是待插入节点
        *  否则，将指针指向左孩子
        */
            if(node.val>val){
                if(node.left==null){
                    node.left=new TreeNode(val);
                    break;
                }
                node=node.left;
            }
       /*
        *  如果当前节点的值小于待插入的值，那么在右子树中寻找
        *  如果是叶子节点，那么此节点的右孩子则是待插入节点
        *  否则，将指针指向右孩子
        */
            else{
                if(node.right==null){
                    node.right=new TreeNode(val);
                    break;
                }
                node=node.right;
            }
        }
        return root;
    }
}
```
## 算法复杂度
**时间复杂度**：O(n),n为树的深度  
**空间复杂度**：  
递归：O(n),n为树的深度，因为递归栈  
迭代：O(1)
