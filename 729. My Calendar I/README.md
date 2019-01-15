## 题目
[问题链接](https://leetcode-cn.com/problems/my-calendar-i/)
## 思路
~~暴力法，十分地暴力，就是将所有日程一个接一个放入容器，放之前还要先遍历容器内是否已经存在日程。十分耗费时、空间~~  
日程类的底层选用List容器，List存放若干长度为2的数组。其中，数组的首尾元素分别为日程的开始和结束时刻  
```java
List<int[]> bottom;
    public MyCalendar() {
        bottom=new ArrayList<>();
    }
```
book()方法，遍历List容器，判断当前时刻的区间是否和已安排日程重叠，这里的判断调用canBeAdded()方法
```java
public boolean book(int start, int end) {
        for(int i=0;i<bottom.size();i++)
            if(!canBeAdded(start,end,bottom.get(i)))
                return false;
        bottom.add(new int[]{start,end});
        return true;
    }
```
canBeAdded()方法，返回值为boolean类型，参数是即将安排的开始时间和结束时间以及一个已经安排日程的数组  
其中判断日程不能被安排的情况有三种
```java
public boolean canBeAdded(int start,int end,int[] calendar){
        //1.被安排日程的开始时间在区间[数组首，数组尾)  解释：开始时间不能在区间内，且不能和已安排日程的开始发生重叠
        if(calendar[0]<=start&&start<calendar[1])
            return false;
        //2.被安排日程的结束时间在区间(数组首，数组尾]  解释：结束时间不能在区间内，且不能和已安排日程的结束发生重叠
        if(calendar[0]<end&&end<=calendar[1])
            return false;
        //3.已经安排的日程被
        if(start<=calendar[0]&&calendar[1]<=end)
            return false;
        return true;
    }
```
## 算法复杂度
**时间复杂度**：O(n)，n为日程的数量  
**空间复杂度**：O(n)，日程的数量*2
