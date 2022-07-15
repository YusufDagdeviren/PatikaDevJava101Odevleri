package Kullanici_Girisi;

import java.util.Scanner;

/*
 * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 * eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve 
 * unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , 
 * şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
 *  sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kullaniciAdi, sifre, yeniSifre;
        System.out.println("Lutfen Kullanici adinizi giriniz: ");
        kullaniciAdi = scanner.nextLine();
        System.out.println("Lutfen sifrenizi giriniz: ");
        sifre = scanner.nextLine();
        if (kullaniciAdi.equals("Yusuf") && sifre.equals("12345")) {
            System.out.println("Kullanici girisi dogru");
        } else if (!sifre.equals("12345")) {
            System.out.println("Yanlis sifre lutfen sifrenizi sifirlamak ister misiniz? (e/h)");
            char soru = scanner.nextLine().charAt(0);
            if (soru == 'e') {
                System.out.println("Lutfen yeni sifrenizi giriniz: ");
                yeniSifre = scanner.nextLine();
                if (yeniSifre.equals(sifre)) {
                    System.out.println("Yeni sifreniz yanlis girdiginiz sifreniz olamaz tekrar girin...");
                } else if (yeniSifre.equals("12345")) {
                    System.out.println("Yeni sifreniz eski sifreniz olamaz lutfen tekrar girin....");
                } else {
                    System.out.println("Şifreniz değiştirildi....");
                    sifre = yeniSifre;
                }
            } else {
                System.out.println("Sistemden cikis yapiliyor...");
            }
        }

    }

}
