package HackerRank_Problemi_4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int total = 0;
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            total = a;
            for (int j = 0; j <= n - 1; j++) {
                total += b * Math.pow(2, j);
                System.out.print(total + " ");
            }
            System.out.println();
            total = 0;
        }
        in.close();
    }
}
