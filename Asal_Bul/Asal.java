package Asal_Bul;
// 1-100 arasindaki asallar
public class Asal {
    public static void main(String[] args) {
        int must=0;
        for(int i=1;i<=100;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    must++;
                }
            }
            if(must==2){
                System.out.println(i+" Sayisi asaldir...");
            }
            must=0;

        }
    }
}
