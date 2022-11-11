/*
-www.patika.dev

--Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak
yapan programı yazınız.
*/
import java.util.Scanner;

public class RecursiveUsHesabi {

    static int exponentCalc(int a, int b) {
        if (b == 0) return 1;
        else return a * exponentCalc(a, b - 1);
    }


    public static void main(String[] args) {
        int base, exponent;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini girin: ");
        int a = input.nextInt();
        System.out.print("Üs değerini girin: ");
        int b = input.nextInt();
        System.out.println("Sonuç: " + exponentCalc(a, b));


    }
}
