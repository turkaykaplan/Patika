/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi  (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. 
İlk olarak uçuşun toplam fiyatını hesaplayın  ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. 
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/

import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {

    public static void main(String[] args) {
        Scanner yazdir = new Scanner(System.in);
        double yas, mesafe, toplam, indirim1,indirim2,indirim3,indirim4,indirim5,indirim6,indirim7, tip;

        System.out.print("Mesafeyi giriniz (KM): ");
        mesafe = yazdir.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        yas = yazdir.nextDouble();
        System.out.println("'1' - Tek Yön , '2' - Gidiş-Dönüş. Seçiniz: ");
        tip = yazdir.nextDouble();

        toplam = (double) (mesafe*0.10);                // Toplam bilet fiyatı üzerinden:
        indirim1 = (double) (toplam - (toplam*0.5));    // 12 yaşından küçükler için %50 indirim
        indirim2 = (double) (toplam - (toplam*0.1));    // 12-24 yaş arası için %10 indirim
        indirim3 = (double) (toplam - (toplam*0.3));    // 65 yaş üstü için %30 indirim
        indirim4 = (double) (toplam - (toplam*0.2));    // Gidiş-dönüş bileti (Tip=2) için  %20 indirim
        indirim5 = (double) (indirim1 -(indirim1*0.2)); // Gidiş dönüş indirimi & 12 yaşından küçükler için %50 indirim
        indirim6 = (double) (indirim2 -(indirim2*0.2)); // Gidiş dönüş indirimi & 12-24 yaş arası için %10 indirim
        indirim7 = (double) (indirim3 -(indirim3*0.2)); // Gidiş dönüş indirimi & 65 yaş üstü için %30 indirim

        if((tip == 1 || tip ==2) && (yas > 0 && mesafe> 0)){

            if(tip==1){
               if(yas<12){
                   System.out.println("Toplam tutar:"+ indirim1 +" TL");
               } else if (yas < 24 && yas > 12) {
                   System.out.println("Toplam tutar:"+ indirim2 +" TL");
               } else if (yas > 24 && yas < 65) {
                   System.out.println("Toplam tutar:"+ toplam +" TL");
               }else if (yas > 65) {
                   System.out.println("Toplam tutar:"+ indirim3 +" TL");

               }
            } else if (tip==2) {
                if(yas<12){
                    System.out.println("Toplam tutar:"+ (indirim5*2) +" TL");
                } else if (yas < 24 && yas > 12) {
                    System.out.println("Toplam tutar:"+ (indirim6*2) +" TL");
                } else if (yas > 24 && yas < 65) {
                    System.out.println("Toplam tutar:"+ (indirim4*2) +" TL");
                } else if (yas > 65) {
                    System.out.println("Toplam tutar:"+ (indirim7*2) +" TL");
            }
        }

        }else {
            System.out.println("Hatalı veri girdiniz.");

        }
    }
}
