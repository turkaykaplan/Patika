/*
- www.patika.dev
-- Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program.
*/

import java.util.Scanner;

public class DortveBesKuvvetleri {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        number = input.nextInt();

        for(int i=1; i<=number; i*=4){          // i = i*2
            System.out.print("4'ün kuvveti: "+i);
            System.out.println();
        }
        System.out.println("--------------------");
            for(int a=1; a<=number; a*=5){          // i = i*2
                System.out.print("5'in kuvveti: "+a);
                System.out.println();

        }

    }
}
