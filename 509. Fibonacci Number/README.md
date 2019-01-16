## 题目
计算第n项斐波那契数
## 思路
```java
/*
 *  递归版，时间复杂度O(2^n)
 */
     public int fib(int N) {
        if(N == 0)
            return 0;
        if(N == 1)
            return 1;
        return fib(N-1) + fib(N-2);
    }
```
```java
/*
 *  迭代版，时间复杂度O(n)，空间复杂度O(1)
 */
    public int fib(int N) {
        if(N==0) return 0;
        if(N==1) return 1;
        int pre1=0;
        int pre2=1;
        int ans=0;
        for(int i=2;i<=N;i++){
            ans=pre1+pre2;
            pre1=pre2;
            pre2=ans;
        }        
        return ans;
    }
```
