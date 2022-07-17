package Recursive_Asal;

import java.util.Scanner;

/*
 * Java dilinde "Recursive" metot kullanarak, 
 * kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
 */
public class Asal {
    static void asalMi(int num1,int num2){
        if(num2==1){
            System.out.println(num1+" sayiniz asal bir sayidir...");
            return;
        }
        if(num1%num2==0){
            System.out.println(num1+" sayiniz asal degildir...");
            return;
        }
        asalMi(num1, --num2);


    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Asalligini sorgulayacaginiz sayiyi giriniz: ");
        int num1 = scanner.nextInt();
        asalMi(num1,num1-1);
    }
}
