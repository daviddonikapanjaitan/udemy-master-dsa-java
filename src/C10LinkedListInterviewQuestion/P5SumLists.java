package C10LinkedListInterviewQuestion;

public class P5SumLists {

    P1LinkedListClass sumLists(P1LinkedListClass llA, P1LinkedListClass llB) {
        Node n1 = llA.head;
        Node n2 = llB.head;
        int carry = 0;
        P1LinkedListClass resultLL = new P1LinkedListClass();
        while(n1 != null || n2 != null){
            int result = carry;
            if(n1 != null){
                result += n1.value;
                n1 = n1.next;
            }
            if(n2 != null){
                result += n2.value;
                n2 = n2.next;
            }
            resultLL.insertNode(result % 10);
            carry = result / 10;
        }

        return resultLL;
    }
}
