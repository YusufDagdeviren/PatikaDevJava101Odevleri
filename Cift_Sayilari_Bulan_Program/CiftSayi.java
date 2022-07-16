package Cift_Sayilari_Bulan_Program;

import java.util.Scanner;

/*
 * Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4' tam bölünen sayıların ortalamasını
 * hesaplayan programı yazınız.
 */
public class CiftSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        double total = 0, count = 0;

        System.out.println("Lutfen bir sayi giriniz");
        num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {

            if (i % 3 == 0) {
                total += i;
                count++;
            } else if (i % 4 == 0) {
                total += i;
                count++;
            }

        }
        System.out.println("Ortalama= "+(total/count));

    }
}
