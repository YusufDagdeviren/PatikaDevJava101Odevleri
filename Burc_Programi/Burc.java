package Burc_Programi;

import java.util.Scanner;

/*
 * Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
Ödev
Aynı örneği switch-case kullanmadan yapınız.
 */
public class Burc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dogdunuz ayi giriniz: ");
        int ay = scanner.nextInt();
        System.out.println("Lutfen dogdunuz gunu giriniz: ");
        int gun = scanner.nextInt();
        if (ay == 1) {
            if(gun>0 && gun<22){
                System.out.println("Burcunuz Oğlak");
            }else if(gun>21 && gun<31){
                System.out.println("Burcunuz Kova");
            }else{
                System.out.println("Yanlis gun secimi");
            }

        } else if (ay == 2) {
            if(gun>0 && gun<20){
                System.out.println("Burcunuz Kova");
            }else if(gun>19 && gun<31){
                System.out.println("Burcunuz Balik");
            }else{
                System.out.println("Yanlis gun secimi");
            }
        } else if (ay == 3) {
            if(gun>0 && gun<21){
                System.out.println("Burcunuz Balik");
            }else if(gun>20 && gun<31){
                System.out.println("Burcunuz Koc");
            }else{
                System.out.println("Yanlis gun secimi");
            }
        } else if (ay == 4) {
            if(gun>0 && gun<21){
                System.out.println("Burcunuz Koc");
            }else if(gun>20 && gun<31){
                System.out.println("Burcunuz Boga");
            }else{
                System.out.println("Yanlis gun secimi");
            }
        } else if (ay == 5) {
            if(gun>0 && gun<22){
                System.out.println("Burcunuz Boga");
            }else if(gun>21 && gun<31){
                System.out.println("Burcunuz Ikizler");
            }else{
                System.out.println("Yanlis gun secimi");
            }
        } else if (ay == 6) {
            if(gun>0 && gun<23){
                System.out.println("Burcunuz Ikizler");
            }else if(gun>22 && gun<31){
                System.out.println("Burcunuz Yengec");
            }else{
                System.out.println("Yanlis gun secimi");
            }
        } else if (ay == 7) {
            if(gun>0 && gun<23){
                System.out.println("Burcunuz Yengec");
            }else if(gun>22 && gun<31){
                System.out.println("Burcunuz Aslan");
            }else{
                System.out.println("Yanlis gun secimi");
            }
        } else if (ay == 8) {
            if(gun>0 && gun<23){
                System.out.println("Burcunuz Aslan");
            }else if(gun>22 && gun<31){
                System.out.println("Burcunuz Basak");
            }else{
                System.out.println("Yanlis gun secimi");
            }
        } else if (ay == 9) {
            if(gun>0 && gun<23){
                System.out.println("Burcunuz Basak");
            }else if(gun>22 && gun<31){
                System.out.println("Burcunuz Terazi");
            }else{
                System.out.println("Yanlis gun secimi");
            }
        } else if (ay == 10) {
            if(gun>0 && gun<23){
                System.out.println("Burcunuz Terazi");
            }else if(gun>22 && gun<31){
                System.out.println("Burcunuz Akrep");
            }else{
                System.out.println("Yanlis gun secimi");
            }
        } else if (ay == 11) {
            if(gun>0 && gun<22){
                System.out.println("Burcunuz Akrep");
            }else if(gun>21 && gun<31){
                System.out.println("Burcunuz Yay");
            }else{
                System.out.println("Yanlis gun secimi");
            }
        } else if (ay == 12) {
            if(gun>0 && gun<22){
                System.out.println("Burcunuz Yay");
            }else if(gun>21 && gun<31){
                System.out.println("Burcunuz Oglak");
            }else{
                System.out.println("Yanlis gun secimi");
            }
        } else {
            System.out.println("Yanlis ay!!!");
        }
    }
}
