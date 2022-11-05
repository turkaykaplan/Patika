import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int ay, gun;
        String burc = " ";
        System.out.print("Doğduğunuz ay(1-12): ");
        ay = giris.nextInt();

        if(ay<1 || ay>12) {
            System.out.println("Geçerli bir sayı(ay) girmediniz!");
        } else {

            System.out.print("Lütfen gün giriniz(1-31): ");
            gun = giris.nextInt();
            if (gun < 1 || gun > 31) {
                System.out.println("Geçerli bir sayı(gün) girmediniz! ");
            }else {
            if (ay == 1) {
                if (gun <= 19) {
                    burc = " Oğlak";
                }
                else if (gun > 19) {
                    burc = " Kova";
                }
            }
            if (ay == 2) {
                if (gun <= 18) {
                    burc = " Kova";
                }
                else if (gun > 18) {
                    burc = " Balık";
                }
            }
            if (ay == 3) {
                if (gun <= 19) {
                    burc = " Balık";
                }
                else if (gun > 19) {
                    burc = "Koç";
                }
            }
            if (ay == 4) {
                if (gun <= 19) {
                    burc = " Koç";
                }
                else if (gun > 19) {
                    burc = " Boğa";
                }
            }
            if (ay == 5) {
                if (gun <= 20) {
                    burc = " Boğa";
                }
                else if (gun > 20) {
                    burc = " İkizler";
                }
            }
            if (ay == 6) {
                if (gun <= 21) {
                    burc = " İkizler";
                }
                else if (gun > 21) {
                    burc = " Yengeç";
                }
            }
            if (ay == 7) {
                if (gun <= 22) {
                    burc = " Yengeç";
                }
                else if (gun > 22) {
                    burc = " Aslan";
                }
            }
            if (ay == 8) {
                if (gun <= 22) {
                    burc = " Aslan";
                }
                else if (gun > 22) {
                    burc = " Başak";
                }
            }
            if (ay == 9) {
                if (gun <= 22) {
                    burc = " Başak";
                }
                else if (gun > 22) {
                    burc = " Terazi";
                }
            }
            if (ay == 10) {
                if (gun <= 22) {
                    burc = " Terazi";
                }
                else if (gun > 22) {
                    burc = " Akrep";
                }
            }
            if (ay == 11) {
                if (gun <= 21) {
                    burc = " Akrep";
                }
                else if (gun > 21) {
                    burc = " Yay";
                }
            }
            if (ay == 12) {
                if (gun <= 21) {
                    burc = " Yay";
                }
                else if (gun > 21) {
                    burc = " Oğlak";
                }

            }System.out.println("Burcunuz:" +burc);

        }
        }
    }

}