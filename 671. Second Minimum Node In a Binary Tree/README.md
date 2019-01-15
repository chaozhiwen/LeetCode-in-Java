## 题目
给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点有两个子节点的话，那么这个节点的值不大于它的子节点的值。  
给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。
## 思路
根据题意，树中最小节点一定是根节点，但是第二小的节点位置不确定，因此需要遍历树 
***
递归版：  
时间复杂度：O(n)  
空间复杂度：O(n)
```java
/* 
 *  传入两个参数给find()方法，一个节点，一个最小值(根节点的值)
 *  基本思路是
 *  根节点->叶子节点有若干条路径，找出每条路径上的第一个大于根节点的节点
 *  再分别比较每一路径下的找到的节点，找到最小值
 */
    public int find(TreeNode node,int val){
       
        if(node==null)  //此条路径无更大节点
            return -1;
        
        if(node.val>val) //当发现第一个大的节点，立刻返回
            return node.val;
        
        if(find(node.left,val)<0) //若左子树无更大节点，对右子树递归
            return find(node.right,val);
        
        if(find(node.right,val)<0) //若右子树无更大节点，对左子树递归
            return find(node.left,val);
            
        return Math.min(find(node.right,val),find(node.left,val));//否则，返回左右子树中的最小节点
    }
```
迭代版：  
时间复杂度：O(n)  
空间复杂度：O(n)
```java
/*
 *  任一遍历方式，这里采用层序遍历
 *  这里还需声明一个整型变量smallest，取最小值(根节点)
 *  维护一个整型second，初值为Integer.MAX_VALUE
 *  每访问一个节点，判断其是否在(smallest，second)内
 *  如果该节点在区间内，则将区间缩小至(smallest,节点.val)
 */
 public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        int smallest=root.val;
        int second=Integer.MAX_VALUE;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode tmp=q.poll();
            if(tmp.val<second&&tmp.val>smallest)
                second=tmp.val;
            if(tmp.left!=null)
                q.add(tmp.left);
            if(tmp.right!=null)
                q.add(tmp.right);
        }
        return second==Integer.MAX_VALUE?-1:second;
    }
```
