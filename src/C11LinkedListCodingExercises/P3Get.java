package C11LinkedListCodingExercises;

public class P3Get {
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
            System.out.println("The SLL does not exist");
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

    // Get
    public Node get(int index) {
        if(index < 0 || index >= size) {
            return null;
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public static void main(String[] args) {
        P3Get ll = new P3Get();
        ll.push(1);
        ll.push(5);
        ll.push(10);
        ll.push(15);
        ll.push(20);

        System.out.println(ll.get(4).value);
    }
}
