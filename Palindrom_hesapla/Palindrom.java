package Palindrom_hesapla;

import java.util.Scanner;

/*
 * Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
    Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */

public class Palindrom {
    static void palindromBul(int sayi) {
        String tersten = new String();
        int temp = sayi;
        do {
            tersten += String.valueOf(temp % 10);
            temp /= 10;

        } while (temp > 0);
        String result = (Integer.valueOf(tersten) == sayi) ? "Palindrom sayi" : "Palindrom sayi degil";
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        palindromBul(sayi);

    }
}
