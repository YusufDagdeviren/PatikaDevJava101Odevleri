package Buyukten_Kucuge;

import java.util.Scanner;

public class BuyuktenKucuge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Lutfen ilk sayiyi giriniz: ");
        a = scanner.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz: ");
        b = scanner.nextInt();
        System.out.println("Lutfen ucuncu sayiyi giriniz: ");
        c = scanner.nextInt();
        if (a > b && b > c) {
            System.out.println("a>b>c");
        } else if (b > a && a > c) {
            System.out.println("b>a>c");
        } else if (c > a && a > b) {
            System.out.println("c>a>b");
        } else if (a > c && c > b) {
            System.out.println("a>c>b");
        } else if(b>c && c>a){
            System.out.println("b>c>a");
        }else{
            System.out.println("c>b>a");
        }

    }
}
