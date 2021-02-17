package hackerrank.challenges.appleoranges;

//problem link https://www.hackerrank.com/challenges/apple-and-orange/problem

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesNo = 0;
        int orangesNo = 0;

        for (int i = 0; i < apples.length; i++) {
            if ((a + apples[i]) >= s && (a + apples[i]) <= t) {
                applesNo++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            if ((b + oranges[i]) >= s && (b + oranges[i]) <= t) {
                orangesNo++;
            }
        }
        System.out.println(applesNo);
        System.out.println(orangesNo);
    }

    public static void main(String[] args) {
        int[] apples = {2, 3, -4};
        int[] oranges = {3, -2, -4};
        countApplesAndOranges(7, 10, 4, 12, apples, oranges);
    }

}
