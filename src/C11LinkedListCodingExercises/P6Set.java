package C11LinkedListCodingExercises;

public class P6Set {

    public Node head;
    public Node tail;
    public int size;

    public Node insertSinglyLinkedList(int nodeValue){
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

    public boolean set(int index, int value) {
        if(head == null){
            head.value = value;
            tail.value = value;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
                if(currentNode == null){
                    return false;
                }
            }
            currentNode.value = value;
        }
        return true;
    }

    public static void main(String[] args) {
        P6Set ll = new P6Set();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);
        System.out.println(ll.tail.value);
        ll.set(4, 1000);
        System.out.println(ll.tail.value);
    }
}
