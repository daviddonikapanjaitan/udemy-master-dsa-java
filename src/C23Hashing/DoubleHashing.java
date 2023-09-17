package C23Hashing;

import java.util.ArrayList;

public class DoubleHashing {

    String[] hashTable;
    int noOfCellsUsedInHashTable;

    DoubleHashing(int size){
        hashTable = new String[size];
        noOfCellsUsedInHashTable = 0;
    }

    public int simpleASCIIHashFunction(String x, int M) {
        char ch[];
        ch = x.toCharArray();
        int i, sum;
        for (sum=0, i=0; i<x.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    // Rehash
    public void rehashKeys(String word) {
        noOfCellsUsedInHashTable = 0;
        ArrayList<String> data = new ArrayList<>();
        for(String s: hashTable) {
            if(s != null) {
                data.add(s);
            }
            data.add(word);
            hashTable = new String[hashTable.length *2];
            for(String s1: data) {
                // Insert Hash table
                insertKeyInHashTable(s1);
            }
        }
    }

    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("\nHashTable does not exists");
            return;
        } else {
            System.out.println("\n----------HashTable----------");
            for (int i=0; i<hashTable.length; i++) {
                System.out.println("Index " + i + ", key:" + hashTable[i]);
            }
        }
    }

    private int addAllDigitsTogether(int sum) {
        int value = 0;
        while(sum > 0) {
            value = sum % 10;
            sum = sum / 10;
        }

        return value;
    }

    public int secondHashFunction(String x, int M) {
        char ch[];
        ch = x.toCharArray();
        int i, sum;
        for(sum = 0, i = 0; i < x.length(); i++){
            sum += ch[i];
        }
        while(sum > hashTable.length){
            sum = addAllDigitsTogether(sum);
        }

        return sum % M;
    }

    public double getLoadFactor() {
        return noOfCellsUsedInHashTable * 1.0 / hashTable.length;
    }

    public void insertKeyInHashTable(String value) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(value);
        } else {
            int x = simpleASCIIHashFunction(value, hashTable.length);
            int y = secondHashFunction(value, hashTable.length);
            for (int i = 0; i<hashTable.length; i++) {
                int newIndex = (x + i*y) % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = value;
                    System.out.println(value +" inserted at location:" +newIndex);
                    break;
                } else {
                    System.out.println(newIndex +" is occupied. Tryin next empty index..");
                }

            }
        }
        noOfCellsUsedInHashTable++;
    }
}
