package C37DivideAndConquerAlgo;

public class P4KnapSack {

    public static void main(String[] args) {
        ZeroOneKnapsack zok = new ZeroOneKnapsack();
        int[] profits = {31,26,17,72};
        int[] weights = {3,1,2,5};
        int maxProfit = zok.knapSack(profits, weights, 7);
        System.out.println(maxProfit);

    }
}
