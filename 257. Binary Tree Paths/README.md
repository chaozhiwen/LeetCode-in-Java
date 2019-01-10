## 题目
给定一个二叉树，返回所有从根节点到叶子节点的路径。
## 思路
```java
/*
 *  递归
 *  Begin：传入参数，题目参数root，空字符串""，空List<String>
 */
public static void res(TreeNode root,String s,List<String> ans){
        if(root==null) return;
        
        s+=root.val+"";//将当前节点的数据拼接在传入参数s后面
        
        /*
         *  判断当前节点是否为叶子节点
         *  如果是
         *  将s放入List中
         */ 
        if(root.left==null&&root.right==null)
            ans.add(s);
            
       /*
        *  对左右子树分别递归，其中字符串的值添加"->"
        *  如果左/右子树为空，将直接返回，不会在末尾添加"->"
        */
        res(root.left,s+"->",ans);
        res(root.right,s+"->",ans);
        
    }
```
## 算法复杂度
**时间复杂度**：O(n)，树的遍历  
**空间复杂度**：O(n)，递归调用隐型栈
