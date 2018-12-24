class MyHashMap {
    private int[] k;
    private boolean[] v;
    /** Initialize your data structure here. */
    public MyHashMap() {
        k=new int[1000000];
        v=new boolean[1000000];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        k[key]=value;
        v[key]=true;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(v[key]) return k[key];
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        v[key]=false;
    }
}

class Main{
	public static void main(String[] args){
		MyHashMap h1=new MyHashMap();
		System.out.println("h1.get(28),h1.get(29),h1.get(30),h1.get(31)："+h1.get(28)+" "+h1.get(29)+" "+h1.get(30)+" "+h1.get(31));
		h1.put(29,6);
		h1.put(30,7);
		h1.put(31,8);
		System.out.println("h1.get(28),h1.get(29),h1.get(30),h1.get(31)："+h1.get(28)+" "+h1.get(29)+" "+h1.get(30)+" "+h1.get(31));
		h1.put(29,66);
		System.out.println("h1.get(28),h1.get(29),h1.get(30),h1.get(31)："+h1.get(28)+" "+h1.get(29)+" "+h1.get(30)+" "+h1.get(31));
		h1.remove(29);
		System.out.println("h1.get(28),h1.get(29),h1.get(30),h1.get(31)："+h1.get(28)+" "+h1.get(29)+" "+h1.get(30)+" "+h1.get(31));
	}
}
