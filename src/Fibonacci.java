/*
- www.patika.dev

--Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
*/
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int value;

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını girin: ");
        value = input.nextInt();


        int n1 = 0;
        int n2 = 1;
        int t = 0;
        for (int i = 2; i < value; i++) {
            t = n1 + n2;
            System.out.println(t);
            n1 = n2;
            n2 = t;

        }

    }

}

