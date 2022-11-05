import java.util.Scanner;

public class GirilenSayiyaKadarUcveDordeBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {

        Scanner yazdir = new Scanner(System.in);

        int sayi,ortalama=0,toplam=0,adet=0;

        System.out.print("Sayı girin: ");
        sayi = yazdir.nextInt();

        for(int i=1; i<=sayi; i++){
            if(i%3==0 && i%4==0){
                toplam =+ i;
                adet++;
            }
        }
        ortalama = toplam/adet;
        System.out.print(sayi +" sayısına kadar 3 ve 4'e tam bölünen sayıların ortalaması: "+ortalama);
    }
}
