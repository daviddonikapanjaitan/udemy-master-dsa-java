package C16CrackingRecursionInterview;

public class P1QuestionAnswer {

    public static void main(String[] args) {
        P1QuestionAnswer main = new P1QuestionAnswer();

//        var result = main.sumOfDigits(111);
//        System.out.println(result);

//        var result = main.power(2, 2);
//        System.out.println(result);

//        var result = main.gcd(-8, 4);
//        System.out.println(result);

        var result = main.decimalToBinary(121);
        System.out.println(result);
    }

    // Question 1
    public int sumOfDigits(int n) {

        if(n == 0 || n < 0) {
            return 0;
        }

        return n % 10 + sumOfDigits(n / 10);
    }

    // Question 2 - Power
    public int power(int base, int exp) {
        if(exp < 0){
            return -1;
        }

        if(exp == 0){
            return 1;
        }
        return base * power(base, exp - 1);
    }

    // Question 3 - GCD
    public int gcd(int a, int b) {
        if(a < 0 || b < 0){
            return -1;
        }

        if(b == 0) {
            return a;
        }

        return gcd(a, a % b);
    }

    // Question 4 - Decimal To Binary
    public int decimalToBinary(int n) {
        if(n == 0){
            return 0;
        }

        return n % 2 + 10 *decimalToBinary(n / 2);
    }
}
