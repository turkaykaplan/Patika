/*
- www.patika.dev
--Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
*/
public class AsalSayi {
    public static void main(String[] args) {


        for (int i = 2; i < 100; i++) {
            int counter = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    counter++;

                }
            }
            if (counter == 1) System.out.print(i + ",");


        }
    }
}
