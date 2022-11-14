/*
- www.patika.dev

--Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
*/
import java.util.Arrays;
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        int[] wrong = new int[5];
        int right = 0;
        while (right < 5) {
            System.out.print("Sayıyı tahmin edin: ");
            int choice = input.nextInt();
            if (choice < 0 || choice > 100) {
                System.out.println("0 ile 100 arasında bir değer giriniz");
            } else {
                if (choice == number) {
                    System.out.println("Tebrikler. Gizli Sayı: " + number);
                    wrong[right++] = choice;
                    break;
                } else {
                    if (choice > number) {
                        System.out.println(choice + " sayısı, gizli sayıdan büyüktür.");
                        System.out.println("Kalan Hakkınız: " + (4 - right));

                    } else {
                        System.out.println(choice + " sayısı, gizli sayıdan küçüktür.");

                        System.out.println("Kalan Hakkınız: " + (4 - right));
                    }
                    wrong[right++] = choice;


                }
            }
        }
        if (right == 5) System.out.println("Hakkınız bitti. Gizli sayı: " + number);
        System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        
    }

}
