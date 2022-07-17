import java.util.Scanner;

public class Palindrom {
        static void palindromBul(String cumle) {
            String tersten = new String();
            for(int i=cumle.length()-1;i>=0;i--){
                tersten+=cumle.charAt(i);
            }
            
            if(cumle.equals(tersten)){
                System.out.println("Cumleniz palindrom");
            }else{
                System.out.println("Palindrom degil");
            }
            
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lutfen bir cumle giriniz: ");
            String cumle = scanner.nextLine();
            palindromBul(cumle);
    
        }
    }
