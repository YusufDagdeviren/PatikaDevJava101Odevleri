import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int total=0,count=0;
        int[] num = new int[n];
        for(int i=0;i<num.length;i++){
             num[i] = scanner.nextInt();
        }
        
        
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                total+=num[j];
                if(total<0){
                count++;
            }
            }
            
            total=0;
        }
        System.out.println(count);
        
    }
}