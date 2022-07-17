package MinMax_Arrays;

public class MinMax {
    public static int[] selectionShort(int[] array) {
        int min, temp;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };
        int minValue = list[0];
        int maxValue = list[0];
        int[] orderedList = selectionShort(list);
        System.out.print("En yakın minimum ve maksimum değeri bulunacak sayıyı giriniz:");
        int number = input.nextInt();

        for (int i : orderedList) {
            if (i < number) {
                minValue = i;
            }
            if (i > number) {
                maxValue = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minValue);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxValue);

        input.close();

    }
}
