package Ucgen_Alani_Bulan_Program;

import java.util.Scanner;

public class Alanbul {
    /*
     * Ödev
     * Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan
     * programı yazınız.
     * 
     * Formül
     * Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
     * 
     * 𝑢 = (a+b+c) / 2
     * 
     * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, cevre, u, alan;
        System.out.println("Lutfen birinci kenarı giriniz: ");
        a = scanner.nextDouble();
        System.out.println("Lutfen ikinci kenarı giriniz: ");
        b = scanner.nextDouble();
        System.out.println("Lutfen ucuncu kenarı giriniz: ");
        c = scanner.nextDouble();
        cevre = a + b + c;
        System.out.println("Cevre = " + cevre);
        u = cevre / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Ucgenin alani= " + alan);

    }
}
