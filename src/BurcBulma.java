import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;
        String horoscope = " ";
        System.out.print("Doğduğunuz ay(1-12): ");
        month = input.nextInt();

        if(month<1 || month>12) {
            System.out.println("Geçerli bir sayı(ay) girmediniz!");
        } else {

            System.out.print("Lütfen gün giriniz(1-31): ");
            day = input.nextInt();
            if (day < 1 || day > 31) {
                System.out.println("Geçerli bir sayı(gün) girmediniz! ");
            }else {
            if (month == 1) {
                if (day <= 19) {
                    horoscope = " Oğlak";
                }
                else if (day > 19) {
                    horoscope = " Kova";
                }
            }
            if (month == 2) {
                if (day <= 18) {
                    horoscope = " Kova";
                }
                else if (day > 18) {
                    horoscope = " Balık";
                }
            }
            if (month == 3) {
                if (day <= 19) {
                    horoscope = " Balık";
                }
                else if (day > 19) {
                    horoscope = "Koç";
                }
            }
            if (month == 4) {
                if (day <= 19) {
                    horoscope = " Koç";
                }
                else if (day > 19) {
                    horoscope = " Boğa";
                }
            }
            if (month == 5) {
                if (day <= 20) {
                    horoscope = " Boğa";
                }
                else if (day > 20) {
                    horoscope = " İkizler";
                }
            }
            if (month == 6) {
                if (day <= 21) {
                    horoscope = " İkizler";
                }
                else if (day > 21) {
                    horoscope = " Yengeç";
                }
            }
            if (month == 7) {
                if (day <= 22) {
                    horoscope = " Yengeç";
                }
                else if (day > 22) {
                    horoscope = " Aslan";
                }
            }
            if (month == 8) {
                if (day <= 22) {
                    horoscope = " Aslan";
                }
                else if (day > 22) {
                    horoscope = " Başak";
                }
            }
            if (month == 9) {
                if (day <= 22) {
                    horoscope = " Başak";
                }
                else if (day > 22) {
                    horoscope = " Terazi";
                }
            }
            if (month == 10) {
                if (day <= 22) {
                    horoscope = " Terazi";
                }
                else if (day > 22) {
                    horoscope = " Akrep";
                }
            }
            if (month == 11) {
                if (day <= 21) {
                    horoscope = " Akrep";
                }
                else if (day > 21) {
                    horoscope = " Yay";
                }
            }
            if (month == 12) {
                if (day <= 21) {
                    horoscope = " Yay";
                }
                else if (day > 21) {
                    horoscope = " Oğlak";
                }

            }System.out.println("Burcunuz:" +horoscope);

        }
        }
    }

}
