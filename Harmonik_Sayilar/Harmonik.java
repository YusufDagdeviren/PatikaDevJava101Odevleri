package Harmonik_Sayilar;

import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        double num,total=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        num = scanner.nextDouble();
        for(double i=1.0;i<=num;i++){
            total+= 1/i;

        }
        System.out.println("Harmonik toplam = "+total);
    }
}
