package Kuvvet_Hesapla;

import java.util.Scanner;

/*
 * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
public class Kuvvet {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println(i);
            }

        }

    }
}
