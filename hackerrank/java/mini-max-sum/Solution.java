import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/mini-max-sum/problem

public class Solution {

    static void miniMaxSum(int[] arr) {

      long sum = 0;
      int min = Integer.MAX_VALUE;
      int max = 0;

      for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
        if (arr[i] < min) min = arr[i];
        if (arr[i] > max) max = arr[i];
      }
        System.out.println((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}

