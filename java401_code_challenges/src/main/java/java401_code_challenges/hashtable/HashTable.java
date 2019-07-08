package java401_code_challenges.hashtable;

public class HashTable<T>{

    private int bucketSize = 100;

    public Linkedlist[] bucket = new Linkedlist[bucketSize];

    public HashTable(){
        for(int i = 0; i < bucket.length; i++){
            bucket[i] = new Linkedlist();
        }
    }


    public void add(String key, T value){
        int index = getHash(key)% bucketSize;
        bucket[index].appendToLinkedList(key, value);
    }


    public boolean contains(String key){
        int hashedValue =getHash(key)%bucketSize;
        return bucket[hashedValue].includes(key);
    }

    public T get(String key){
        int hashedValue = getHash(key)%bucketSize;
        T result = (T) bucket[hashedValue].getvalue(key);
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













