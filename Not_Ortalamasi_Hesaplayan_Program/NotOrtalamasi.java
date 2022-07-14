package Not_Ortalamasi_Hesaplayan_Program;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        /*
         * Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav
         * puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan
         * programı yazın.
         * Ödev
         * Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının
         * ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı"
         * yazsın.
         * Not : If ve Else kullanılmayacak...
         */
        Scanner scanner = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih, muzik;
        System.out.println("Lutfen matematik notunuzu giriniz: ");
        matematik = scanner.nextInt();
        System.out.println("Lutfen fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();
        System.out.println("Lutfen kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();
        System.out.println("Lutfen turkce notunuzu giriniz: ");
        turkce = scanner.nextInt();
        System.out.println("Lutfen tarih notunuzu giriniz: ");
        tarih = scanner.nextInt();
        System.out.println("Lutfen muzik notunuzu giriniz: ");
        muzik = scanner.nextInt();
        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double ort = toplam / 6.0;
        System.out.println("Ortalamanız=" + ort);
        String gecmeDurumu = (ort >= 60) ? "Gecti :)" : "Kaldi :(";
        System.out.println(gecmeDurumu);

    }
}
