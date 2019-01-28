## 题目
给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
## 思路
```java
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;//双指针，验证前后字符是否相等
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))//当发现不相等的字符时
                return isPalindrome(s,i+1,j)||isPalindrome(s,i,j-1);//首指针和尾指针分别跳过当前字符，继续验证剩下的字符串是否回文
            else{i++;j--;}
        }
        return true;
    }
    
    //验证回文串
    private boolean isPalindrome(String s,int i,int j){
        if(i>j) return false;
        while(i<=j){
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        }
        return true;
    }
```
## 算法复杂度
**时间复杂度**：O(n)，双指针实际是O(n/2)  
**空间复杂度**：O(1)
