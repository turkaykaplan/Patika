
/*- www.patika.dev
-- Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
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
        double age, distance, total, discount1,discount2,discount3,discount4,discount5,discount6,discount7, type;

        System.out.print("Mesafeyi giriniz (KM): ");
        distance = yazdir.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        age = yazdir.nextDouble();
        System.out.println("'1' - Tek Yön , '2' - Gidiş-Dönüş. Seçiniz: ");
        type = yazdir.nextDouble();

        total = (double) (distance*0.10);                // Toplam bilet fiyatı üzerinden:
        discount1 = (double) (total - (total*0.5));    // 12 yaşından küçükler için %50 indirim
        discount2 = (double) (total - (total*0.1));    // 12-24 yaş arası için %10 indirim
        discount3 = (double) (total - (total*0.3));    // 65 yaş üstü için %30 indirim
        discount4 = (double) (total - (total*0.2));    // Gidiş-dönüş bileti (Tip=2) için  %20 indirim
        discount5 = (double) (discount1 -(discount1*0.2)); // Gidiş dönüş indirimi & 12 yaşından küçükler için %50 indirim
        discount6 = (double) (discount2 -(discount2*0.2)); // Gidiş dönüş indirimi & 12-24 yaş arası için %10 indirim
        discount7 = (double) (discount3 -(discount3*0.2)); // Gidiş dönüş indirimi & 65 yaş üstü için %30 indirim

        if((type == 1 || type ==2) && (age > 0 && distance> 0)){

            if(type==1){
               if(age<12){
                   System.out.println("Toplam tutar:"+ discount1 +" TL");
               } else if (age < 24 && age > 12) {
                   System.out.println("Toplam tutar:"+ discount2 +" TL");
               } else if (age > 24 && age < 65) {
                   System.out.println("Toplam tutar:"+ total +" TL");
               }else if (age > 65) {
                   System.out.println("Toplam tutar:"+ discount3 +" TL");

               }
            } else if (type==2) {
                if(age<12){
                    System.out.println("Toplam tutar:"+ (discount5*2) +" TL");
                } else if (age < 24 && age > 12) {
                    System.out.println("Toplam tutar:"+ (discount6*2) +" TL");
                } else if (age > 24 && age < 65) {
                    System.out.println("Toplam tutar:"+ (discount4*2) +" TL");
                } else if (age > 65) {
                    System.out.println("Toplam tutar:"+ (discount7*2) +" TL");
            }
        }

        }else {
            System.out.println("Hatalı veri girdiniz.");

        }
    }
}
