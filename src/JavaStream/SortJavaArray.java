package JavaStream;

import java.util.Arrays;

public class SortJavaArray {
    public static void main(String[] args) {
        int[] a = {4, 2, 3, 1};

        //Logic for Ascending Order
        for (int i = 0; i < a.length; i++){
            for (int j = i +1; j < a.length; j++){
                if (a[i] > a[j]){ // for descending order change > by <
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
