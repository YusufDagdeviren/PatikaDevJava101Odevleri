package Dairenin_Alanini_Bulan_Program;

import java.util.Scanner;

public class DaireAlanBul {
    /*
     * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan
     * programı yazınız.
     * 
     * 𝜋 sayısını = 3.14 alınız.
     * 
     * Formül : (𝜋 * (r*r) * 𝛼) / 360
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double merkezAci,yaricap,alan;
        System.out.println("Lütfen merkez acisi olcusu giriniz: ");
        merkezAci = scanner.nextDouble();
        System.out.println("Lutfen yaricap giriniz: ");
        yaricap = scanner.nextDouble();
        alan = (Math.PI*Math.pow(yaricap, 2)*merkezAci)/360;
        System.out.println("Alan = "+alan);
    }
}
