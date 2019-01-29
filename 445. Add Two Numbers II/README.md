## 题目
给定两个非空链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储单个数字。将这两数相加会返回一个新的链表。
## 思路
加法运算，要从个位开始，还要考虑进位的问题  
1.先将两个链表的每个节点分别保存在两个栈中。这样，从栈顶到栈底保存了两链表中从个位到最高位的每一位
```
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        while(l1!=null){
            stack1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            stack2.push(l2.val);
            l2=l2.next;
        }
```
2.令两栈顶项出栈相加，然后加进位carry，此时得到的值在[0,27]范围内，其个位作为新节点的值，十位数字作为下次迭代中carry的值。然后将新节点保存在List中
```
        List<ListNode> nodeList=new ArrayList<>();
        int carry=0;
        while(!stack1.empty()||!stack2.empty()){
            int sum=0;
            if(!stack1.empty())
                sum+=stack1.pop();
            if(!stack2.empty())
                sum+=stack2.pop();
            nodeList.add(new ListNode((sum+carry)%10));
            carry=(sum+carry)/10;
        }
```
3.先考虑在最后以为的进位是否为0，若不为0，则将进位carry作为新节点的值添加至List中。由于在List中是按照从低位至高位的顺序存放节点，因此要从后向前
设置next指针
```
        if(carry!=0)
            nodeList.add(new ListNode(carry));      
        for(int i=nodeList.size()-1;i>0;i--)
            nodeList.get(i).next=nodeList.get(i-1);
```
## 算法复杂度
**时间复杂度**：O(m+n)  
**空间复杂度**：O(m+n)
