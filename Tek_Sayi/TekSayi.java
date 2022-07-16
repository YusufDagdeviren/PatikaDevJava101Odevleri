package Tek_Sayi;

import java.util.Scanner;

/*
 * Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri 
kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz. 
 */
public class TekSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, num;
        while (true) {
            System.out.println("Lutfen Bir sayi giriniz: ");
            num = scanner.nextInt();
            if (num % 2 == 1) {
                break;
            } else {
                if (num % 4 == 0) {
                    total += num;
                }
            }

        }
        System.out.println("4 ün katlari olan sayilarin toplami= " + total);
    }
}
