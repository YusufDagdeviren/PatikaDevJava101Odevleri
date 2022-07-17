package Tekrar_Bul;

public class Bul {

    public static void main(String[] args) {
        int[] sayi = { 1, 2, 22, 3, 4, 3, 3, 2, 6, 7, 8, 1, 2 };
        int[] tekrar = new int[sayi.length];
        int temp, kontrol = 0;
        for (int i = 0; i < sayi.length; i++) {

            temp = 0;
            for (int j = 0; j < sayi.length; j++) {
                if (sayi[i] == sayi[j]) {
                    temp++;
                }
            }
            if (temp != 1) {
                for (int k = 0; k < tekrar.length; k++) {
                    if (sayi[i] == tekrar[k]) {
                        kontrol = 1;
                    }
                }
                if (kontrol != 1) {
                    System.out.println(sayi[i] + " elemani " + temp + " kez tekrar etti");
                }

            }
            tekrar[i] = sayi[i];
        }

    }
}
