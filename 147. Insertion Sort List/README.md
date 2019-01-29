## 题目
对链表进行插入排序。
## 思路
一般的插入排序，是从后向前挨个比较找插入位置，但对于链表需从前至后寻找  
首先需要创建一个哨兵指针sentry，该指针始终指向链表的首节点。
```java
    //cur为待比较节点，pre为待比较节点的前驱节点
    while(cur!=null){
        ListNode h=sentry;
        while(cur.val>h.next.val)//由前至后，寻找插入位置，h停下的地方是待插入位置
            h=h.next;

        pre.next=cur.next;//确认位置后，首先将待插入元素的后继交给自己的前驱
        cur.next=h.next;//将待插入位置的后继接在待插入元素后面
        h.next=cur;//最后改变待插入元素的前驱，完成交换

        if(pre.val<cur.val)//经过上述步骤，若待插入节点的位置未发生改变
            pre=pre.next;//则将前驱向后移动
        if(pre==null) break;
        cur=pre.next;
    }
```
## 算法复杂度
- 时间复杂度：O(n^2)
- 空间复杂度：O(1)
