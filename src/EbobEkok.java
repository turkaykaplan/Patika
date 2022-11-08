import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        int ekok = 1;
        int n1, n2;
        int ebob = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını girin: ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını girin: ");
        n2 = input.nextInt();

        int i = 1;
        while (i <= n1 && i <= n2) {             // EBOB BULMA
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int j = 1;
        while (j <= (n1 * n2)) {            // EKOK BULMA
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
                break;
            }
            j++;
        }

        System.out.println("Sayıların ebobu = " + ebob);
        System.out.println("Sayıların ekoku = " + ekok);

/*      ekok = (n1*n2)/ebob;          //EKOK FORMÜLÜ
        System.out.println("Sayıların ebobu = "+ebob);
        System.out.println("Sayıların ekoku = "+ekok);                  */

    }
}
