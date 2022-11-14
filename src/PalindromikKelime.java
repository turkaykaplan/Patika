/*
- www.patika.dev

-- Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.
Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
*/

import java.util.Scanner;

public class PalindromikKelime {
    static boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j))
                return false;

            i++;
            j--;
        }


        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelime girin: ");
        String word = input.nextLine();
        System.out.print(isPalindrome(word) +"");
        System.out.println();
        if(true)  System.out.print("Palindromik kelime.");

}
}



