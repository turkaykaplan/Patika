/*
-www.patika.dev
-- Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
 */

public class DizilerHarmonikOrtalama {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double avg = 0;
        double sum = 0;
        for (double i : numbers) {
            sum += 1 / i;

        }
        avg = numbers.length / sum;
        System.out.println("Harmonik ortalama: " +avg);
    }
}







