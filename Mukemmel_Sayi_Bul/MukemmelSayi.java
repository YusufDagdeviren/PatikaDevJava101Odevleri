package Mukemmel_Sayi_Bul;

import java.util.Scanner;

/*
 * Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) 
toplamı kendisine eşit olan sayıya mükemmel sayı denir.
 */
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz: ");
        int num1 = scanner.nextInt(),total=0;
        for(int i=1;i<num1;i++){
            if(num1%i==0){
                total+=i;
            }
        }
        String result = (total==num1) ? "Sayiniz mukemmel sayidir":"Sayiniz mukkemmel sayi degildir";
        System.out.println(result);

    }
    
}
