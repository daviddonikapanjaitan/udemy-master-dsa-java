package C3ArrayCodingExercises;

public class P7LeetCode121 {

    public static void main(String[] args) {
        new P7LeetCode121();
    }

    public P7LeetCode121(){
        int[] prices = {7, 1, 5, 3, 6, 4};

        int minPrices = Integer.MAX_VALUE;
        int maxPrices = 0;
        for (int i = 0; i < prices.length; i++) {
            if(minPrices > prices[i]){
                minPrices = prices[i];
                continue;
            }

            if(maxPrices < prices[i]){
                maxPrices = prices[i];
            }
        }

        System.out.println(minPrices);
        System.out.println(maxPrices);
        int profit = maxPrices - minPrices;
        System.out.println(profit);
    }
}
