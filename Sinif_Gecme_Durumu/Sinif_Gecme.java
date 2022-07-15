package Sinif_Gecme_Durumu;

import java.util.Scanner;

public class Sinif_Gecme {
    /*
     * Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
     * 
     * Geçme Notu : 55
     * 
     * Ödev
     * Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya
     * katılmasın.
     */
    public static void main(String[] args) {
        double math, phy, turk, chem, msc, count = 0, total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen matematik notunu giriniz...");
        math = scanner.nextDouble();
        if (!(math < 0 || math > 100)) {
            total += math;
            count++;
        }
        System.out.println("Lutfen fizik notunu giriniz...");
        phy = scanner.nextDouble();
        if (!(phy < 0 || phy > 100)) {
            total += phy;
            count++;
        }
        System.out.println("Lutfen turkce notunu giriniz...");
        turk = scanner.nextDouble();
        if (!(turk < 0 || turk > 100)) {
            total += turk;
            count++;
        }
        System.out.println("Lutfen muzik notunu giriniz...");
        msc = scanner.nextDouble();
        if (!(msc < 0 || msc > 100)) {
            total += msc;
            count++;
        }
        String gecme = (total/count)>=55 ? "Gecti":"Kaldi";
        System.out.println(gecme);

    }
}
