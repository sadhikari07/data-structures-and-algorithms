package java401_code_challenges.hashtable;

public class Node<T> {
    public String key;
    public T value;
    public Node<T> next;

    public Node(String key, T value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
