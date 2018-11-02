import java.util.HashSet;
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String temp="";
        int count=1;
        HashSet<String> hs=new HashSet();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                temp+=(morseCode[translate(words[i].charAt(j))]);
            }
            hs.add(temp);
            temp="";
        }
        return hs.size();
    }
    //translate letter to Morse Code
    public static int translate(char i){
        switch(i){
            case 'a':return 0;
            case 'b':return 1;
            case 'c':return 2;
            case 'd':return 3;
            case 'e':return 4;
            case 'f':return 5;
            case 'g':return 6;
            case 'h':return 7;
            case 'i':return 8;
            case 'j':return 9;
            case 'k':return 10;
            case 'l':return 11;
            case 'm':return 12;
            case 'n':return 13;
            case 'o':return 14;
            case 'p':return 15;
            case 'q':return 16;
            case 'r':return 17;
            case 's':return 18;
            case 't':return 19;
            case 'u':return 20;
            case 'v':return 21;
            case 'w':return 22;
            case 'x':return 23;
            case 'y':return 24;
            default:return 25;
        }
    }
}
class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		String[] st={"a","b","c","d","e","f","g","h","i","j","k","l","m"};
		System.out.println("{\"a\",\"b\",\"c\",\"d\",\"e\",\"f\",\"g\",\"h\",\"i\",\"j\",\"k\",\"l\",\"m\"}"+s.uniqueMorseRepresentations(st));
	}
}
