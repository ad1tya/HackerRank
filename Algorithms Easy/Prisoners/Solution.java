import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int saveThePrisoner(int n, int m, int s){
        // Complete this function
        long num = (m + s - 1);
        if(num <= n){
            return (int)num;
        } else if(num % n != 0){
			return (int)(num % n);
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
}
