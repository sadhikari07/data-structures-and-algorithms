package java401_code_challenges.tree;


public class Node <T extends Comparable<T>>{
    public T value;
    public Node<T> leftChild;
    public Node<T> rightChild;

    public Node(T value) {
        this.value = value;
        leftChild = null;
        rightChild = null;

    }


}
