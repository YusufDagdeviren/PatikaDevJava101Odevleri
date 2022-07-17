import java.util.Scanner;

public class Transpoz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1, s2;
        System.out.println("Satir sayisini giriniz: ");
        s1 = scanner.nextInt();
        System.out.println("Sutun sayisini giriniz: ");
        s2 = scanner.nextInt();
        int[][] matris = new int[s1][s2];
        int[][] tmatris = new int[s2][s1];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(i + ". Satir " + j + ". Sutunu giriniz: ");
                matris[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < tmatris.length; i++) {
            for (int j = 0; j < tmatris[i].length; j++) {
                tmatris[i][j] = matris[j][i];
            }
        }
        for (int i = 0; i < tmatris.length; i++) {
            for (int j = 0; j < tmatris[i].length; j++) {
                System.out.print(tmatris[i][j]+" ");
                
            }
            System.out.println();
        }

    }
}
