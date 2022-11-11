/*
- www.patika.dev
-- Recursive ile asal sayı bulan program.
*/

import java.util.Scanner;


public class RecursiveAsalSayi {

    static void isPrime(int number, int i) {
        if (i == number) {
            System.out.print(number + " asal sayıdır");
            return;
        } else if (number % i == 0) {
            System.out.print(number + " asal sayı değildir.");
            return;
        }

        isPrime(number, i + 1);

    }

    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        number = input.nextInt();
        isPrime(number, 2);
    }

}
