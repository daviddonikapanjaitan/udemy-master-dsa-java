package C15Recursion;

public class P2FibonnaciRecursion {

    public static void main(String[] args) {
        P2FibonnaciRecursion recursion = new P2FibonnaciRecursion();
        var rec = recursion.fibonnaci(-2);
        System.out.println(rec);

    }

    public int fibonnaci(int n) {
        if(n < 0){
            return -1;
        }

        if(n == 0 || n == 1) {
            return n;
        }

        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }
}
