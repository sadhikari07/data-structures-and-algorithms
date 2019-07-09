package java401_code_challenges.hashtable;

public class HashTable<T>{

    public int numberOfBuckets = 100;
    public Linkedlist[] bucketsArray = new Linkedlist[numberOfBuckets];

    public HashTable(){
        for(int i = 0; i < bucketsArray.length; i++){
            bucketsArray[i] = new Linkedlist();
        }
    }


    public void add(String key, T value){
        int index = getHash(key)% numberOfBuckets;
        bucketsArray[index].appendToLinkedList(key, value);
    }

    public boolean contains(String key){
        int hashedValue =getHash(key)% numberOfBuckets;
        boolean result =  bucketsArray[hashedValue].includes(key);
        return result;
    }

    public T get(String key){
        int hashedValue = getHash(key)% numberOfBuckets;
        T result = (T) bucketsArray[hashedValue].getvalue(key);
        return result;
    }

    public int getHash(String key){
        int sumAscii = 0;
        for(int i = 0; i<key.length(); i++){
            sumAscii = (int)key.charAt(i) + sumAscii;
        }
        return sumAscii;
    }
}













