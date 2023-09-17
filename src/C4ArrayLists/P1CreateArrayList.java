package C4ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class P1CreateArrayList {

    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(1);
//        numbers.add(1, 4);
//        System.out.println(numbers);
//        ArrayList<String> stringList = new ArrayList<String>();
//        stringList.add("A");
//        stringList.add("B");
//        stringList.add(2, "C");
//        System.out.println(stringList);

//        ArrayList<String> stringList = new ArrayList<String>();
//        stringList.add("A");
//        stringList.add("B");
//        stringList.add(2, "C");
//        System.out.println(stringList);
//        System.out.println(stringList.get(2));
//        System.out.println(stringList.get(0));

//        ArrayList<String> stringList = new ArrayList<String>();
//        stringList.add("A");
//        stringList.add("B");
//        stringList.add("C");
//        stringList.add("D");
//        stringList.add("E");
//        Iterator<String> iterator = stringList.iterator();
//        while(iterator.hasNext()){
//            String letter = iterator.next();
//            System.out.println(letter);
//        }

//        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
//        for(String letter: stringList){
//            if (letter.equals("F")) {
//                System.out.println("The element is found");
//                break;
//            }
//        }
//        int index = stringList.indexOf("F");
//        System.out.print("The element is found at index: " + index);

        ArrayList<String> stringList =new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
        stringList.remove("D");
        System.out.println(stringList);
    }
}
