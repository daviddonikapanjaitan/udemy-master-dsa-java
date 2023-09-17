package C17RecursionProblems;

public class P1Solution1 {

    public static void main(String[] args) {
        P1Solution1 rec = new P1Solution1();

        // int result = rec.power(2, 3);
        // int result = rec.factorial(3);
        // int[] A = {1, 2, 3, 4, 5};
        // int result = rec.productofArray(A, A.length);
        // int result = rec.recursiveRange(300);
        int result = rec.fib(7);

        System.out.println(result);
    }

    // power solution
    public static int power(int base, int exponent){
        if(exponent == 0){
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    // Factorial Solution
    public int factorial(int num) {
        if(num <= 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

    // product of array solution
    public int productofArray(int A[], int N) {
        if(N <= 0){
            return 1;
        }
        return (productofArray(A, N - 1) * A[N - 1]);
    }

    // recursive range
    public int recursiveRange(int num) {
        if(num <= 0){
            return 0;
        }

        return num + recursiveRange(num - 1);
    }

    // Fibonacci Solution
    public int fib(int n) {
        if(n < 0){
            return -1;
        }
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

}
