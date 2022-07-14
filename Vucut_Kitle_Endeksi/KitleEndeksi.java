package Vucut_Kitle_Endeksi;

import java.util.Scanner;

/*
 * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
 */
public class KitleEndeksi {
    public static void main(String[] args) {
        double boy,kilo,endeks;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextDouble();
        endeks = kilo / Math.pow(boy, 2);
        System.out.println("Vücut Kitle İndeksiniz : "+endeks);

    }

}
