class Solution{
    public int lengthOfLastWord(String s) {
        s=s.trim();
        char[] a=s.toCharArray();
        Stack<Character> st=new Stack();
        for(int i=a.length-1;i>=0;i--){
            if(Character.isSpaceChar(a[i])){
                break;
            }
            st.push(a[i]);
        }        
        return st.size();
    }
}