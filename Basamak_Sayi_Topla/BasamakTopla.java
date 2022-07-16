package Basamak_Sayi_Topla;

import java.util.Scanner;

/*
 * Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
 */
public class BasamakTopla {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int num,total=0;
         System.out.println("Lutfen bir sayi giriniz: ");
         num = scanner.nextInt();
         do{
         total+=num%10;
         num/=10;

         }while(num>0);
         System.out.println("Toplam = "+total);
        

        

    }

}
