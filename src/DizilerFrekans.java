import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DizilerFrekans {

    public static void main(String[] args) {

        int count = 0;
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        List<Integer> numberList = new ArrayList<>();

        System.out.println("Dizi: " + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) count++;
            }
            if (!(numberList.contains(list[i])) && count > 0) {
                numberList.add(list[i]);
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi");
            }
            count = 0;
        }
    }
}



