package C10LinkedListInterviewQuestion;

public class P1LinkedListClass {

    public Node head;
    public Node tail;
    public int size;

    public void createLL(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNode (int nodeValue) {
        if(head == null){
            createLL(nodeValue);
            return;
        }

        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traversalLL(){
        Node tempNode = head;
        for(int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if(i != size - 1){
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
//        P1LinkedListClass ll = new P1LinkedListClass();
//        ll.createLL(1);
//        ll.insertNode(9);
//        ll.insertNode(5);
//        ll.insertNode(10);
//        ll.insertNode(2);
//        ll.traversalLL();

//        P2RemoveDuplicates q = new P2RemoveDuplicates();
//        q.deleteDups(ll);
//        ll.traversalLL();

//        P3ReturnNthLast q = new P3ReturnNthLast();
//        Node n = q.nthToLast(ll, 5);
//        System.out.println(n.value);

//        P4Partition q = new P4Partition();
//        P1LinkedListClass t = q.partition(ll, 3);
//        ll.traversalLL();

//        P1LinkedListClass llA = new P1LinkedListClass();
//        llA.insertNode(7);
//        llA.insertNode(1);
//        llA.insertNode(6);
//        P1LinkedListClass llB = new P1LinkedListClass();
//        llB.insertNode(5);
//        llB.insertNode(9);
//        llB.insertNode(2);
//        P5SumLists q = new P5SumLists();
//        P1LinkedListClass result = q.sumLists(llA, llB);
//        result.traversalLL();

        P1LinkedListClass llA = new P1LinkedListClass();
        llA.insertNode(3);
        llA.insertNode(1);
        llA.insertNode(5);
        llA.insertNode(9);
        P1LinkedListClass llB = new P1LinkedListClass();
        llB.insertNode(2);
        llB.insertNode(4);
        llB.insertNode(6);
        P6Intersection q = new P6Intersection();
        q.addSameNode(llA, llB, 7);
        q.addSameNode(llA, llB, 2);
        q.addSameNode(llA, llB, 2);
        Node inter = q.findInterception(llA, llB);
        System.out.println(inter.value);
    }
}
