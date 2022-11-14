/*
- www.patika.dev

--Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
*/
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        System.out.println(number);
        int right = 0;
        while (right < 5) {
            System.out.print("Sayıyı tahmin edin: ");
            int choice = input.nextInt();
            if (choice < 0 || choice > 100) {
                System.out.println("0 ile 100 arasında bir değer giriniz");
            } else {
                if (choice == number) {
                    System.out.println("Tebrikler. Gizli Sayı: " + number);
                    break;
                } else {
                    if (choice > number) {
                        System.out.println(choice + " sayısı, gizli sayıdan büyüktür.");
                        right++;
                        System.out.println("Kalan Hakkınız: " +(5-right));

                    } else {
                        System.out.println(choice + " sayısı, gizli sayıdan küçüktür.");
                        right++;
                        System.out.println("Kalan Hakkınız: " +(5-right));
                    }
                }

            }
        }
        if (right == 5) System.out.println("Hakkınız bitti. Gizli sayı: " + number);



    }

}

