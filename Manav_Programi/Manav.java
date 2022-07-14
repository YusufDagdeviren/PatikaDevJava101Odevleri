package Manav_Programi;

import java.util.Scanner;

/*
 * Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
 */
public class Manav {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double kilo,tutar=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        kilo=scanner.nextDouble();
        tutar+=kilo*armut;
        System.out.println("Elma Kaç Kilo ? :");
        kilo=scanner.nextDouble();
        tutar+=kilo*elma;
        System.out.println("Domates Kaç Kilo ? :");
        kilo=scanner.nextDouble();
        tutar+=kilo*domates;
        System.out.println("Muz Kaç Kilo ? :");
        kilo=scanner.nextDouble();
        tutar+=kilo*muz;
        System.out.println("Patlıcan Kaç Kilo ? :");
        kilo=scanner.nextDouble();
        tutar+=kilo*patlican;
        System.out.println("Toplam tutar = "+tutar);
        
    }
}
