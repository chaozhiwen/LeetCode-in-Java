## 题目 
将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。  
本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
## 思路
一个数组，任何位置上的元素都可以当作根节点，但不是BBST。因此，必须将数组一分为二，将1/2处的元素当作根节点，左右子树分别在该位置左侧和右侧寻找节点，递归
```java
/*
 *  重写sortedArrayToBST()方法，传入3个参数，数组nums，下界lo，上界hi
 *  首先在数组1/2处寻找根节点
 *  左子节点在区间[lo，数组长度1/2-1]寻找中间值作为节点 <--递归
 *  右子节点在区间[数组长度1/2+1，hi]寻找中间值作为节点 <--递归
 */
public TreeNode sortedArrayToBST(int[] nums,int lo,int hi){
        if(lo>hi) return null;
        int mid=lo+(hi-lo)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=sortedArrayToBST(nums,lo,mid-1);
        node.right=sortedArrayToBST(nums,mid+1,hi);
        return node;
    }
```
## 算法复杂度
**时间复杂度**：O(n)，n为数组长度  
**空间复杂度**：O(n)
