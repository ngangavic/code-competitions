package hackerrank.challenges.staircase;

//problem link https://www.hackerrank.com/challenges/staircase/problem

import java.util.Arrays;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {

        char[] arr = new char[n];

        Arrays.fill(arr, ' ');
        for (int i = 1; i <= n; i++) {
            arr[n - i] = '#';
            System.out.println(arr);
        }

    }

    public static void main(String[] args) {
        staircase(5);
    }
}
