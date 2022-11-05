import java.util.Scanner;

public class BasamaklarToplami {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Sayı Giriniz:");
            int number = input.nextInt();

            int basNumber = 0;
            int basTotal = 0;
            int lastBas =0;
            int number2 = number;

            while(number != 0){      // While döngü ve işlem algoritmasının açıklaması:
                lastBas = number%10; // Girilen sayı önce 10 bölünerek işlemin kalanı yani sayının son basamağı bulundu.(lastBas)
                basTotal += lastBas; // Bulunan bu değer (lastBas) basTotal ile alınarak toplama işlemi yapıldı.
                number/=10;          // Bu süreç girilen number değerinin basamak sayısı kadar devam ettirildi.
                                     // 1.Adım # 245%10 = 5 (kalan yani son basamak)
                                     // 2.Adım # 0 = 5+0 (basTotal = basTotal+lastBas) işleminden yeni basTotal 5 oldu.
                                     // 3.Adım # 245 sayısı 10 ile  bölündü.Bölüm işlemi ve bu döngü bölüm değeri "0" çıkana kadar tekrar etti.
            }

            System.out.println(number2+" sayısının basamakları toplamı = "+basTotal);
        }

    }

