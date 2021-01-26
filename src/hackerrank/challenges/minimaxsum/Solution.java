package hackerrank.challenges.minimaxsum;

//problem link https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.util.Arrays;

public class Solution {

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long maxSum = 0;
        long minSum = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("min add" + arr[i]);
            minSum += arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.println("max add" + arr[i]);
            maxSum += arr[i];
        }

        System.out.println("MAX" + maxSum);
        System.out.println("MIN" + minSum);
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {

        miniMaxSum(new int[]{256741038, 623958417, 467905213, 714532089, 938071625});

    }
}
