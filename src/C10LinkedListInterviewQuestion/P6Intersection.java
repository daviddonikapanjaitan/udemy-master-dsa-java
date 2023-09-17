package C10LinkedListInterviewQuestion;

public class P6Intersection {

    Node getKthNode(Node head, int k){
        Node current = head;
        while (k > 0 && current != null) {
            current = current.next;
            k--;
        }
        return current;
    }

    Node findInterception(P1LinkedListClass list1, P1LinkedListClass list2) {
        if(list1.head == null || list2.head == null) {
            return null;
        }
        if(list1.tail != list2.tail){
            return null;
        }
        Node shorter = new Node();
        Node longer = new Node();
        if(list1.size > list2.size){
            longer = list1.head;
            shorter = list2.head;
        } else {
            longer = list2.head;
            shorter = list1.head;
        }

        longer = getKthNode(longer, Math.abs(list1.size - list2.size));
        while(shorter != longer){
            shorter = shorter.next;
            longer = longer.next;

        }

        return longer;
    }

    // Add same node
    void addSameNode(P1LinkedListClass llA, P1LinkedListClass llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
    }
}
