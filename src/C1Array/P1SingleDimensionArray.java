package C1Array;

public class P1SingleDimensionArray {

    int arr[] = null;

    public P1SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try{
            if (arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    // Array Traversal
    public void traverseArray(){
        try{
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }catch(Exception e) {

        }
    }

    // Search for an alement in the given Array
    public void searchInArray(int valueToSearch){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == valueToSearch){
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    // delete value from array
    public void deleteValue(int valueToDelete){
        try {
            arr[valueToDelete] = Integer.MIN_VALUE;
            System.out.println("The Value has been deleted successfully");

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");
        }
    }

    public static void main(String[] args) {
        P1SingleDimensionArray sda = new P1SingleDimensionArray(10);
        sda.insert(0, 10);
        sda.insert(1, 20);
        sda.insert(2, 30);

//        System.out.println("Array traversal");
//        sda.traverseArray();

        // sda.searchInArray(40);

        sda.deleteValue(0);
        System.out.println(sda.arr[0]);
    }
}
