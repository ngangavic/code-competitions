package hackerrank.challenges.plusminus;

//problem link https://www.hackerrank.com/challenges/plus-minus/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;
        int count=arr.length;

        for(int i=0;i<count;i++){
            if(arr[i]>0){
                positiveCount++;
            }else if (arr[i]<0){
                negativeCount++;
            }else{
                zeroCount++;
            }
        }
        DecimalFormat df = new DecimalFormat("#0.000000");
        double positives=Math.round((double) positiveCount/count*1000000d)/1000000d;
        double negatives=Math.round((double) negativeCount/count*1000000d)/1000000d;
        double zeros=Math.round((double) zeroCount/count*1000000d)/1000000d;

        System.out.println(df.format(positives)+"\n"+df.format(negatives)+"\n"+df.format(zeros));

    }

    public static void main(String[] args) {

        plusMinus(new int[]{0, 0, 0, -1, 1});

    }
}
