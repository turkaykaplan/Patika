import java.util.Arrays;
import java.util.Scanner;

public class DizilerEnYakinSayi {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println("Sayınızı girin: ");
        number = input.nextInt();

        int min = list[0];
        int max = list[0];
        for (int i : list) {
            if (number>i) {
                min = i;
            }
            if (number<i) {
                max = i;
                break;
            }
        }        System.out.println("Min değer: " + min);
        System.out.println("Max değer: " + max);


    }
}
