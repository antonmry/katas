import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/time-conversion/problem

public class Solution {

    static String timeConversion(String s) {
        int t = Integer.parseInt(s.substring(0, 2));
        if (s.contains("PM")) {
            if (t == 12) {
                return s.substring(0, s.length() - 2);
            } else {
                return (t + 12) + s.substring(2, s.length() - 2);
            }
        } else {
            if (t == 12) {
                return "00" + s.substring(2, s.length() - 2);
            } else {
                return s.substring(0, s.length() - 2);
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
