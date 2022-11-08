/*
- www.patika.dev
-- Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/

import java.util.Scanner;

public class GirilenSayiyaKadarUcveDordeBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number,avg=0,total=0,counter=0;

        System.out.print("Sayı girin: ");
        number  = input.nextInt();

        for(int i=1; i<=number; i++){
            if(i%3==0 && i%4==0){
                total =+ i;
                counter++;
            }
        }
        avg = total/counter;
        System.out.print(number +" sayısına kadar 3 ve 4'e tam bölünen sayıların ortalaması: "+avg);
    }
}
