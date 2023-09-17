package C11LinkedListCodingExercises;

public class P2Pop {

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

    // Insert Method SinglyLinkedList
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

    public Node pop(){
        if(head == null){
            System.out.println("The SLL does not exist!");
            return null;
        }
        Node removeNode;
        Node currentNode;
        if(head == tail){
            removeNode = head;
            head = tail = null;
        } else {
            currentNode = head;
            while(currentNode.next != tail){
                currentNode = currentNode.next;
            }
            removeNode = currentNode.next;
            currentNode.next = null;
            tail = currentNode;
        }
        size--;

        return removeNode;
    }

    public static void main(String[] args) {
        P2Pop ll = new P2Pop();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);

        System.out.println(ll.pop().value);
        System.out.println(ll.pop().value);
        System.out.println(ll.pop().value);
    }
}
