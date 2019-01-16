## 题目
给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
## 思路
类似于正常的层次遍历，同样需要维护队列结构，只是这里需要加入一个标识，来辨别是否需要反向遍历
```java
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        boolean flag=true;//加入标识flag
        
        while(!queue.isEmpty()){
            int count=queue.size();
            LinkedList<Integer> tmp=new LinkedList<>();//正序访问是Queue，逆向访问是Stack
            
            while(count-->0){
                 TreeNode cur=queue.poll();
                 if(cur.left!=null)
                     queue.add(cur.left);
                 if(cur.right!=null)
                     queue.add(cur.right);
                     
                 //当flag为true时，正向添加，否则反向添加。这里使用队列和栈区别开来
                 if(flag) tmp.add(cur.val);
                 else tmp.push(cur.val);
             }
            res.add(tmp);
            flag=!flag;//同层节点访问完毕后，将标识符取反
        }
        return res;
    }
```
## 算法复杂度
**时间复杂度**：O(n)，遍历每一个节点  
**空间复杂度**：O(n)，层次遍历需要维护队列
