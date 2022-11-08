/*
-patika.dev
--Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
 */
public class Palindrom {

    static boolean isPalindrom(int number) {

        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;   // son basamağı bulduk.
            reverseNumber = (reverseNumber * 10) + lastNumber; // // verilen sayının her rakamı döngü sürecinde bu satırda tersten yazılır
            temp /= 10; // 123 / 10 = 12.3 sonucunu verir. Ama int değer .3 kısmını almaz. Bu sayede 12 sayısından devam edilebilir.

        }

        if (number == reverseNumber) {
            System.out.println(number+" bir palindrom sayıdır.");
            return true;
        } else {
            System.out.println(number +" bir palindrom sayı değildir.");
            return false;
        }

    }
    public static void main(String[] args) {
        isPalindrom(6471);
        isPalindrom(9889);

    }
}