package Recursive_DeseneGoreMetod;

import java.util.Scanner;

public class Metod {
    static void pozitif(int num1,int num2){
        
        if(num1>0){
            System.out.print(num1+" ");
            num1-=5;
            pozitif(num1,num2);
        }else{
            negatif(num1,num2);
        }


    }
    static void negatif(int num1,int num2){
        System.out.print(num1+" ");
        if(num1==num2){
            return;
        }else{
            negatif(num1+=5, num2);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int num1 = scanner.nextInt();
        pozitif(num1,num1);
        
    }
}
