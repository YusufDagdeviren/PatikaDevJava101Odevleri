package Fibonacci_Hesapla_Recursive;

/*
 * Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.
 */
public class Fibonacci {
    public static void fibonacci(int sayi, int n1, int n2) {
        if (sayi == 0)
            return;

        int n3 = n1 + n2;
        System.out.print(n3 + ", ");
        n1 = n2;
        n2 = n3;
        sayi--;
        fibonacci(sayi, n1, n2);

    }

    public static void main(String[] args) {
        System.out.print("1, ");
        fibonacci(10, 0, 1);
    }

}
