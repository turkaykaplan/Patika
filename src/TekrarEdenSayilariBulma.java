import java.util.Arrays;

public class TekrarEdenSayilariBulma {

    static boolean find(int[] Array, int value){

        for(int i : Array){
            if (i == value) {
            return true;
            }
        } return  false;
    }

    public static void main(String[] args) {
        int index = 0;
        int[] list = {8, 7, 5, 16, 76, 8, 16,84,1782, 5,42, 84, 7,2, 3,1782, 9,42,6};
        int[] duplicate = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j] && list[i]%2==0)) {
                    if(!find(duplicate, list[i])) {
                        duplicate[index++] = list[i];
                    }break;              
                }
            }
        }
        System.out.println(Arrays.toString(list));
        for(int value : duplicate){
            if(value !=0)  System.out.println(value);                         
        }
    }
}
