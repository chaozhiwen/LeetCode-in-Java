## 题目
给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
## 思路
1. 需要4个指针  
```java
        ListNode odd=head;//奇数首节点
        ListNode even=head.next;//偶数首节点
        ListNode firstEven=even;//记录偶数首节点
        ListNode cur=even.next;//遍历指针
```
2.从第三个节点开始遍历链表，设置boolean变量flag
```java
        boolean flag=true;//odd:true,even:false
        while(cur!=null){
            //当前节点在奇数位时，将节点续接在odd节点后，odd后移
            if(flag){
                odd.next=cur;
                odd=odd.next;
            }
            //当前节点在偶数位时，将节点接在even节点后，even后移
            else{
                even.next=cur;
                even=even.next;
            }
            flag=!flag;
            cur=cur.next;
        }
```
3. 将odd节点的后继指向even节点的首节点，然后将even节点的后继置空
## 算法复杂度
- 时间复杂度：O(n)  
- 空间复杂度：O(1)
