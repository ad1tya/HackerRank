import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] squares, int d, int m){
        // Complete this function
          int result = 0;
    if (n == m){
        int sum = 0;
        for(int square = 0; square < n; square++)
            sum += squares[square];
        if(sum == d)
            result += 1;
    }
    else{ 
        for(int index1 = 0; index1<(n-m+1); index1++){
            int sum = 0;
            for(int index2 = index1;index2 < (index1+m) ; index2++)
                sum += squares[index2];
            if(sum == d)
                result += 1;
        }
    }
    return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
