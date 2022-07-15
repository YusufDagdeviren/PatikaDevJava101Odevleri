package Cin_Zodyagi;

import java.util.Scanner;

public class CinZodyagiHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dogum tarihini giriniz: ");
        int dogumTarihi = scanner.nextInt();

        if (dogumTarihi % 12 == 0)
            System.out.println("Maymun");

        if (dogumTarihi % 12 == 1)
            System.out.println("Horoz");

        if (dogumTarihi % 12 == 2)
            System.out.println("Kopek");

        if (dogumTarihi % 12 == 3)
            System.out.println("Domuz");

        if (dogumTarihi % 12 == 4)
            System.out.println("Fare");

        if (dogumTarihi % 12 == 5)
            System.out.println("Okuz");

        if (dogumTarihi % 12 == 6)
            System.out.println("Kaplam");

        if (dogumTarihi % 12 == 7)
            System.out.println("Tavsan");

        if (dogumTarihi % 12 == 8)
            System.out.println("Ejderha");

        if (dogumTarihi % 12 == 9)
            System.out.println("Yilan");

        if (dogumTarihi % 12 == 10)
            System.out.println("At");

        if (dogumTarihi % 12 == 11)
            System.out.println("Koyun");
    }
}
