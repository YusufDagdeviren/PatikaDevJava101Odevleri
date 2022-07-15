package Artik_Yil_Hesapla;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sorgulayacaginiz yili giriniz: ");
        int yil = scanner.nextInt();
        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.println("Artik yildir");
            } else
                System.out.println("Artik yil degildir");
        } else if (yil % 4 == 0) {
            System.out.println("Artik yildir");
        } else {
            System.out.println("Artik yil degildir");
        }
    }
}
