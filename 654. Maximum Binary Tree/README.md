## 题目
给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：  
二叉树的根是数组中的最大元素。  
左子树是通过数组中最大值左边部分构造出的最大二叉树。  
右子树是通过数组中最大值右边部分构造出的最大二叉树。  
通过给定的数组构建最大二叉树，并且输出这个树的根节点。
## 思路
每一个节点的取值是在数组中的某个区间里的最大值  
先找出数组中的最大值作为头节点，左孩子在0\~index-1处寻值，右孩子在index+1~末尾处寻值  
左右孩子分别找到自己的index，对左右孩子递归上述步骤  
当区间不存在(区间范围<0)时，说明该节点为空
```java
    //传递三个参数，分别是区间上界和下界以及待查询数组
    public static TreeNode res(int start,int end,int[] nums){
        if(start>end) return null;//区间不存在
        
        int i=start;//上界
        int j=end;//下界
        int index=i;//最大值索引
        
        for(;i<=j;i++)
            if(nums[i]>nums[index])
                index=i;
        TreeNode node=new TreeNode(nums[index]);
        
        node.left=res(start,index-1,nums);//寻找左孩子
        node.right=res(index+1,end,nums);//寻找右孩子
        
        return node;
    }
}
```
## 算法复杂度
**时间复杂度**：O(n)，n为数组长度  
**空间复杂度**：O(n)，递归栈O(n)+创建树节点O(n)=O(2n)
