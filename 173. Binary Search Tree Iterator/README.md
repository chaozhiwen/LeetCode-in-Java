## 题目
实现一个二叉搜索树迭代器。你将使用二叉搜索树的根节点初始化迭代器。  
next() 和 hasNext() 操作的时间复杂度是 O(1)，并使用 O(h) 内存，其中 h 是树的高度。  
你可以假设 next() 调用总是有效的，也就是说，当调用 next() 时，BST 中至少存在一个下一个最小的数。
## 思路
```java
//声明一个成员变量--栈，存放节点
    Stack<TreeNode> s;
```
```java
/*
 *  构造方法：
 *  栈初始化
 *  将根节点以及根的最左侧的孩子们依次压栈
 *  时间复杂度：O(n)，n为树的高度
 *  空间复杂度：O(n)，n为树的高度
 */
    public BSTIterator(TreeNode root) {
        s=new Stack<>();
        while(root!=null){
            s.push(root);
            root=root.left;
        }
    }
```
```java
/*
 *  next()方法：返回int类型BST中下一最小节点的值
 *  类似于中序遍历，构造方法已经将所有最左侧节点压栈，因此，当前栈顶节点必为最小项，记录当前栈顶项，弹出
 *  将当前记录节点的所有最左侧节点压栈，返回记录节点的值
 *  时间复杂度：O(n)，n小于树高
 *  空间复杂度：O(n)，n小于树高
 */
    public int next() {
        if(!this.hasNext()) return -1;
        
        TreeNode ans=s.pop();
        TreeNode tmp=ans.right;
        while(tmp!=null){
            s.push(tmp);
            tmp=tmp.left;
        }
        return ans.val;
    }
```
```java
/*  hasNext()方法：返回是否还有元素未访问
 *  栈空，则节点访问完毕，反之，取反
 *  时间复杂度：O(1)
 *  空间复杂度：O(1)
 */
    public boolean hasNext() {
        return !s.empty();
    }
}
```
