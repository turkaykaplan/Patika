
import java.util.Scanner;

public class MatrisTranspoz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz : ");
        int r = input.nextInt();
        System.out.print("Sütun sayısını giriniz : ");
        int c = input.nextInt();

        int[][] matris = new int[r][c];
        int[][] transpose = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((i+ 1) + ". satırın " + (j +1) + ". elemanını giriniz: ");
                matris[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matris: ");
        for(int i[] : matris){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Matris Transpozu: ");
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                transpose[i][j] = matris[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}


