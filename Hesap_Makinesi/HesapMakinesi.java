package Hesap_Makinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz: ");
        int num1 = scanner.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz: ");
        int num2 = scanner.nextInt();
        System.out.println("Lutfen secim yapiniz\n(1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme)");
        int choose = scanner.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Toplam = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Cikarma= " + (num1 - num2));
                break;
            case 3:
                System.out.println("Carpma= " + (num1 * num2));
                break;
            case 4:
                System.out.println("Bolme= " + (num1 / num2));
                break;
            default:
                System.out.println("Hatali islem....");
        }

    }
}
