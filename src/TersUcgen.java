/*
-www.patika.dev
-- Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

*/

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını girin: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k<= (2 * (n - i)) + 1; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
