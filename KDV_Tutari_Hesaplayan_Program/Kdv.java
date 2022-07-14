package KDV_Tutari_Hesaplayan_Program;

import java.util.Scanner;

public class Kdv {
    /*
     * Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını
     * hesaplayıp ekrana bastıran programı yazın.
     * 
     * (Not : KDV tutarını 18% olarak alın)
     * 
     * KDV'siz Fiyat = 10;
     * 
     * KDV'li Fiyat = 11.8;
     * 
     * KDV tutarı = 1.8;
     * 
     * Ödev
     * Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000
     * TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı
     * yazınız.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tutar, kdvOran, kdvTutar, kdvliTutar;
        System.out.println("Lutfen urunun tutarini giriniz: ");
        tutar = scanner.nextDouble();
        if (tutar > 0 && tutar < 1000) {
            kdvOran = 0.18;
        } else {
            kdvOran = 0.08;
        }
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("Kdv'siz tutar: " + tutar);
        System.out.println("Kdv orani: " + kdvOran);
        System.out.println("Kdv tutari: " + kdvTutar);
        System.out.println("Kdv'li fiyat: " + kdvliTutar);

    }
}
