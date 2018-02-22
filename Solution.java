import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int resultLow = 0;
        int resultHigh = 0;
        int low = s[0];
        int high = s[0];
        int result[] = new int[2];
        for(int i=1 ; i<s.length ; i++){
            if(high < s[i]){
                ++resultHigh;
                high = s[i];
            } else if(low > s[i]){
                ++resultLow;
                low = s[i];
            }
        }
        result[0] = resultHigh;
        result[1] = resultLow;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
