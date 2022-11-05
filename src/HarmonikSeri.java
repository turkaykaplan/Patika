import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {

        Scanner yazdir=new Scanner(System.in);
        System.out.print("Number : ");
        int num = yazdir.nextInt();
        double result = 0;

        for (double i=1; i<=num; i++){
             result += (1/i);

        }System.out.println("Result: " +result);


    }        


}
