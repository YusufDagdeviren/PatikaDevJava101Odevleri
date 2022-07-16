package Ebob_Ekok_Programi;

import java.util.Scanner;

/*
 * ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.

18’in bölenleri : 1, 2, 3, 6, 9, 18

24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24

Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.

ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.

6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …

8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …

Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.
 */
public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, ebob = 0, ekok = 0;
        System.out.println("please enter the first number: ");
        num1 = scanner.nextInt();
        System.out.println("please enter the second number: ");
        num2 = scanner.nextInt();
        int i = 1;
        if (num1 < num2) {
            while (i <= num1) {
                if (num1 % i == 0 && num2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("Ebob = " + ebob);
            int max = num1 * num2;
        
        for(int j = max; j > 0; j--)
        {
            if(j % num1 == 0 && j % num2 == 0) {
                ekok = j;
            }
        }
        System.out.println("Ekok = " + ekok);
        } else {
            while (i <= num2) {
                if (num1 % i == 0 && num2 % i == 0) {
                    ebob = i;
                }
                i++;

            }
            System.out.println("Ebob = " + ebob);
            int max = num1 * num2;
        
        for(int j = max; j > 0; j--)
        {
            if(j % num1 == 0 && j % num2 == 0) {
                ekok = j;
            }
        }
        System.out.println("Ekok = " + ekok);
        }
        
        

    }
}
