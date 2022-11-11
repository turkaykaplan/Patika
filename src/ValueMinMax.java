/*
- www.patika.dev
-- Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları
bulan ve bu sayıları ekrana yazan programı yazın.

*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ValueMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, number = 1;


        List<Integer> numberList = new ArrayList<Integer>(); // numberList adlı liste oluşturuldu.

        System.out.print("Kaç tane sayı gireceksin: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayınızı girin: ");
            number = input.nextInt();
            numberList.add(number);                         // girilen sayı listeye eklendi.
        }

        Integer max = Collections.max(numberList);          //  en büyük sayı bulma işlemi.
        Integer min = Collections.min(numberList);          //  en küçük sayı bulma işlemi.
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
