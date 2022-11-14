import java.util.Arrays;
import java.util.Scanner;

public class DizilerSiralama {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin: ");
        int k = inp.nextInt();
        int[] numberList = new int[k];

        for (int i = 0; i < numberList.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            numberList[i] = inp.nextInt();
        }
        Arrays.sort(numberList);
        System.out.println(Arrays.toString(numberList));


    }
}
