/* - www.patika.dev
-- Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve 
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/

import java.util.Scanner;

public class DortunKatlariHesaplama {
    public static void main(String[] args) {

        int c;
        int total=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı girin: ");
            c = input.nextInt();
                if(c%2==0 && c%4==0){
                    total += c;
                }

        }while (c%2!=1); // while(c%2==0)

        System.out.println("Toplam: " +total);



    }
}
