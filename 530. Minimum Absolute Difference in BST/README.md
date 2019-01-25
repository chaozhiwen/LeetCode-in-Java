## 题目
给定一个所有节点为非负值的二叉搜索树，求树中任意两节点的差的绝对值的最小值。
## 思路
```java
public int getMinimumDifference(TreeNode root) {
        if(root==null) return 0;
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        //中序遍历BST，将访问的节点的数据域依次放在list中
        while(true){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            if(stack.empty())
                break;
            root=stack.pop();
            list.add(root.val);
            root=root.right;
        }
        int ans=Integer.MAX_VALUE;
        //遍历list中节点的数据域，计算两相邻元素的差，找到最小
        for(int i=0;i<list.size()-1;i++)
            ans=Math.min(list.get(i+1)-list.get(i),ans);
        return ans;
    }
```
## 算法复杂度
**时间复杂度**：O(n)，中序遍历  
**空间复杂度**：O(n)，维护的辅助栈O(n)+存放节点数据域的集合O(n)=O(2n)
