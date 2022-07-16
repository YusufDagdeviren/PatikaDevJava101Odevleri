package EnBuyuk_EnKucuk_Bul;

import java.util.Scanner;

/*
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
-22
 */
public class Bul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        int num = scanner.nextInt(),enb,enk,i=0,input,j=1;
        System.out.println((j++)+".Sayiyi giriniz: ");
        
        input = scanner.nextInt();
        enb = input;
        enk = input;
        while(i<num-1){
            System.out.println(j+".Sayiyi giriniz: ");  
            input = scanner.nextInt();
            if(input<enk){
                enk=input;
            }
            if(input>enb){
                enb=input;
            }
            j++;
            i++;
        }
        System.out.println("En büyük sayı: "+enb);
        System.out.println("En küçük sayı: "+enk);



    }
    
}
