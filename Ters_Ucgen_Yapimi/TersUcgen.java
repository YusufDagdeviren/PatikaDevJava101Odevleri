package Ters_Ucgen_Yapimi;

import java.util.Scanner;

/*
 * 
 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
 */
public class TersUcgen {
    public static void main(String[] args) {
        int a, b;
        Scanner inp = new Scanner(System.in);
        System.out.print("Olusturmak istediginiz yildizlarin basamagini giriniz:");
        a = inp.nextInt();
        for (int i = 0; a >= i; i++) {
            for (int space = 0; space <= i; space++)
                System.out.print(" ");
            for (b = 2 * (a - i) - 1; b >= 1; b--)
                System.out.print("*");
            System.out.println("");
        }
    }
}
