import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// staircase

public class Solution {

    static void staircase(int n) {
      for(int i=0; i < n; i++) {
        for(int j=n-1; j >= 0; j--) {
          if (i < j) {
        System.out.print(' ');
          } else {
        System.out.print('#');
          }
        }
        System.out.println();
      }
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}

