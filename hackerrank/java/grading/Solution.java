import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/grading/problem

public class Solution {

    static int[] solve(int[] grades){
      int[] temp = new int[grades.length];
      for(int i=0; i < grades.length; i++) {
        // System.out.println("Value: " + grades[i] + ", modulo: " + (grades[i] % 5));
        if ((grades[i] < 38) || ((grades[i] % 5) < 3)) temp[i] = grades[i];
        else temp[i] = grades[i] + (5 - grades[i] % 5) ;  
      }

      return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}

