package Hava_Sicakligi;

import java.util.Scanner;

/*
 * Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
 */
//fsfsd
public class HavaSicakligi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sicakliği giriniz...");
        int sicaklik = scanner.nextInt();
        if(sicaklik<5){
            System.out.println("Kayak yap");
        }
        else if(sicaklik>5 && sicaklik<15){
            System.out.println("Sinema git");
        }
        else if(sicaklik>15 && sicaklik<25){
            System.out.println("piknik git");
        }
        else if(sicaklik>25){
            System.out.println("Yüzmeye git");
        }
    }
}
