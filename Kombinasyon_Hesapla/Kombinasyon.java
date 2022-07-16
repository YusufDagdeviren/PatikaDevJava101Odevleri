package Kombinasyon_Hesapla;

import java.util.Scanner;

/*
 * Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nFact = 1, rFact = 1, dFact = 1, numN, numR, numD;
        System.out.println("Ilk sayiyi giriniz: ");
        numN = scanner.nextInt();
        System.out.println("Ikinci sayiyi giriniz: ");
        numR = scanner.nextInt();
        numD = numN - numR;
        for (int i = 1; (i <= numN || i <= numR || i <= numD); i++) {
            if (i <= numN) {
                nFact *= i;
            }
            if (i <= numR) {
                rFact *= i;
            }
            if (i <= numD) {
                dFact *= i;
            }

        }
        System.out.println(nFact);
        System.out.println(rFact);
        System.out.println(dFact);
        System.out.println("C(" + numN + "," + numR + ") = " + (nFact / (rFact * (dFact))));

    }
}
