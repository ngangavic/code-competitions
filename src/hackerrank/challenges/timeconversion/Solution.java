package hackerrank.challenges.timeconversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        DateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
        Date inputDate = null;
        try {
            inputDate = inputFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return outputFormat.format(inputDate);

    }


    public static void main(String[] args) {

        String result = timeConversion("07:05:45PM");
        System.out.println(result);
    }
}
