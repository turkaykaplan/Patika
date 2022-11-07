/* 
-www.patika.dev
-- Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız. 

Artık Yıl Nasıl Hesaplanır?
Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
*/

import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Yılı Giriniz: ");
        year= input.nextInt();

        if ((year%400==0) || (year%100!=0 && year%4==0)){
            System.out.print(year +" bir artık yıldır.");
        }else{
            System.out.print(year +" bir artık yıl değildir.");
        }
    }
}
