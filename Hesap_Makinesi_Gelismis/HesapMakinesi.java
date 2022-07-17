package Hesap_Makinesi_Gelismis;

import java.util.Scanner;

public class HesapMakinesi {
    static void modAl(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen modunu alacaginiz sayiyi giriniz: ");
        int num1 = scan.nextInt();
        System.out.println("Lutfen modu hesaplayacaginiz sayiyi giriniz: ");
        int num2 = scan.nextInt();
        System.out.printf("%d'nin %d modu %d'dir...",num1,num2,(num1%num2));
    }
    static void alanVeCevre(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin bir kenarini giriniz: ");
        int num1 = scan.nextInt();
        System.out.println("Lutfen dikdortgenin bir kenarini giriniz: ");
        int num2 = scan.nextInt();
        System.out.println("Dikdortgenin Cevresi: "+((num1+num2)*2));
        System.out.println("Dikdortgenin Alani: "+(num1*num2));
        
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = 
                 "1- Mod Alma\n"+
                 "2- Dikdörtgen Alan ve Çevre Hesabı\n"+
                 "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    modAl();
                    break;
                case 2:
                    alanVeCevre();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}
