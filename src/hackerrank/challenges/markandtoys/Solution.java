package hackerrank.challenges.markandtoys;

import java.util.Arrays;

public class Solution {
    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            if (sum + prices[i] < k) {
                sum += prices[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int result = maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50);

        System.out.println(result);
    }
}
