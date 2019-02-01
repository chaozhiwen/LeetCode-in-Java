## 题目
反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
## 思路
1. 首先需要以下指针
```java
        ListNode res=new ListNode(0);//哨兵节点，指向首节点
        res.next=head;
        ListNode pre=res;//指向m-1的位置
        ListNode tail;//最后指向n+1的位置
        ListNode last;//记录m处节点
        ListNode first=null;//最后指向n处节点
```
2. 寻找m处节点的前驱
```java
        for(int i=0;i<m-1;i++)
            pre=pre.next;//pre指针指向m-1处
        tail=pre.next;//tail指针先指向m处
        last=tail;
```
3. 反转[m,n]区间内节点
```java
        /*
         *   所有节点反转后
         *   first指针指向反转后的首节点
         *   tail指针指向反转后的尾节点
         */
        for(int i=0;i<=n-m;i++){
            ListNode node=tail;
            tail=tail.next;
            node.next=first;
            first=node;
        }
```
4. 连接反转节点
```java
        pre.next=first;
        last.next=tail;
```
## 算法复杂度
- 时间复杂度：O(n)
- 空间复杂度：O(1)
