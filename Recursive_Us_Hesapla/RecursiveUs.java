package Recursive_Us_Hesapla;

import java.util.Scanner;

public class RecursiveUs {
    static int powerCalculator(int num1, int num2) {
        if (num2 == 1) {
            return num1;
        }
        return num1 * powerCalculator(num1, --num2);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sayiyi giriniz: ");
        int num1 = scanner.nextInt();
        System.out.println("Lutfen ussu giriniz: ");
        int num2 = scanner.nextInt();
        System.out.println(num1+"^"+num2+" = "+powerCalculator(num1,num2));
    }
}
