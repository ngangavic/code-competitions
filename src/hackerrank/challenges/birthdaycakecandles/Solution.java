package hackerrank.challenges.birthdaycakecandles;

//problem link https://www.hackerrank.com/challenges/birthday-cake-candles/problem

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Collections.sort(candles);

        int highest = candles.get(candles.size() - 1);

        int highestCount = 0;

        for (int i = 0; i < candles.size(); i++) {
            if (highest == candles.get(i)) {
                highestCount++;
            }
        }

        return highestCount;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> candles = new ArrayList<Integer>() {{
            add(4);
            add(4);
            add(4);
            add(1);
        }};


        System.out.println(birthdayCakeCandles(candles));

    }
}
