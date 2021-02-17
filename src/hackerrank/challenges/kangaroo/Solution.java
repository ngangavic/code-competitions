package hackerrank.challenges.kangaroo;

//problem link https://www.hackerrank.com/challenges/kangaroo/problem

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int x = x1 - x2;
        int v = v1 - v2;
        String response = "NO";
        if (v2 < v1) {
            if ((x % v) == 0) {
                response = "YES";
            }
        }
        return response;
    }

    public static void main(String[] args) {

        String result = kangaroo(40, 2, 70, 2);
        System.out.println(result);

    }
}
