import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        // sort the array using the built-in sort method
        Arrays.sort(arr);

        // print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}



class SortingExample1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(8);

        // sort the list using the built-in sort method
        Collections.sort(list);

        // print the sorted list
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}

