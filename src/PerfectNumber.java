/*
- www.patika.dev

--Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
 değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
    Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan
sayıya mükemmel sayı denir.

*/
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int number, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) System.out.println(number + " Mükemmel sayıdır.");
        else System.out.println(number + " Mükemmel sayı değildir.");

    }
}
