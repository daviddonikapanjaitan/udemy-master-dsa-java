package C11LinkedListCodingExercises;

public class P7Remove {
    public Node head;
    public Node tail;
    public int size;

    public Node insertSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void push(int nodeValue){
        if(head == null){
            insertSinglyLinkedList(nodeValue);
            return;
        } else {
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public Node remove(int index) {
        if (index<0 || index >= size) {
            return null;
        }
        Node removeNode;
        Node currentNode;
        size--;
        if (index == 0) {
            removeNode = head;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return removeNode;
        } else {
            currentNode = head;
            int indx = 0;
            while (indx < index - 1) {
                currentNode = currentNode.next;
                indx ++;
            }
            removeNode = currentNode.next;
            Node nextNode = currentNode.next;
            currentNode.next = nextNode.next;
            return removeNode;
        }
    }

    public static void main(String[] args) {
        P7Remove ll = new P7Remove();
        ll.push(19);
        ll.push(20);
        ll.push(21);
        ll.push(22);
        ll.push(23);
        System.out.println(ll.head.value);
        ll.remove(0);
        System.out.println(ll.head.value);
    }
}
