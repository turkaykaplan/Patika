/*
- www.patika.dev

--Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
*/
import java.util.Scanner;

public class DesenMetot {

    static void plusFive(int number) {
        if(number>0) {
            System.out.println(number);
            plusFive(number -=5);

        }
        System.out.println(number);

    }
        public static void main (String[]args){
            int number;

            Scanner input = new Scanner(System.in);
            System.out.print("Sayı girin: ");
            number = input.nextInt();
            plusFive(number);

        }


}