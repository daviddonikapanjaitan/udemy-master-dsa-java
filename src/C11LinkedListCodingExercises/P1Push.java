package C11LinkedListCodingExercises;

public class P1Push {

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

    public void push(int nodeValue) {
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

    public static void main(String[] args) {
        P1Push l = new P1Push();
        l.push(1);
        l.push(3);
        System.out.println(l.head.value);
        System.out.println(l.tail.value);
    }
}
