package java401_code_challenges.hashtable;

public class Linkedlist<T> {

        public Node head;
        public Node tail;

        public Linkedlist() {
            this.head = null;
            this.tail = null;
        }

        public void appendToLinkedList(String key, T value) {
            Node newNode = new Node(key, value);
            newNode.next = null;
            if (head == null) {
                head = newNode;
                tail = newNode;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        public boolean includes(String keyCheck) {
            Node current = head;
            while (current != null) {
                if (current.key == keyCheck) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public T getvalue(String keyCheck){
            Node current = head;
            while (current != null){
                if (current.key == keyCheck) {
                    T resultFromNode = (T)current.value;
                    return resultFromNode;
                }
                current = current.next;
            }
            return null;
        }
}
