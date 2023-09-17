package C10LinkedListInterviewQuestion;

import java.util.HashSet;

public class P2RemoveDuplicates {

    void deleteDups(P1LinkedListClass ll) {
        HashSet<Integer> hs = new HashSet<>();
        Node current  = ll.head;
        Node prev = null;
        while(current != null){
            int curval = current.value;
            if(hs.contains(curval)){
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }
}
