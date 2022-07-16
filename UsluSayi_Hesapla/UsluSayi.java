package UsluSayi_Hesapla;

import java.util.Scanner;

/*
 * Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */
public class UsluSayi {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int base,power,result = 1;
         System.out.println("Lutfen uslu sayinizin tabanini giriniz: ");
         base = scanner.nextInt();
         System.out.println("Lutfen uslu sayinizin ussunu giriniz: ");
         power = scanner.nextInt();
         for(int i=0;i<power;i++){
             result *= base;
         }
         System.out.println(result);

    }
}
