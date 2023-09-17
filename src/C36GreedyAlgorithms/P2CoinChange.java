package C36GreedyAlgorithms;

import java.util.Arrays;

public class P2CoinChange {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 10, 1000};
        int amount = 2035;
        System.out.println("Coin available: " + Arrays.toString(coins));
        System.out.println("Target amount: " + amount);
        CoinChangeProblem.coinChangeProblem(coins, amount);
    }
}
