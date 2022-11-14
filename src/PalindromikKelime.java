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

        System.out.print("Palindromik kelime. -");

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelime girin: ");
        String word = input.nextLine();
        System.out.println();
        System.out.print(isPalindrome(word) +"-");

}
}



