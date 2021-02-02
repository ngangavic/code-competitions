package hackerrank.challenges.grade;

//problem link https://www.hackerrank.com/challenges/grading/problem

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++) {
            if ((grades.get(i) >= 38)) {
                if (grades.get(i) % 5 > 2) {
                    int toAdd = 5 - (grades.get(i) % 5);
                    int rounded = grades.get(i) + toAdd;
                    result.add(rounded);
                } else {
                    result.add(grades.get(i));
                }
            } else {

                result.add(grades.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> result = gradingStudents(new ArrayList<Integer>() {{
            add(73);
            add(67);
            add(38);
            add(33);
        }});
        System.out.println(result);

    }
}
